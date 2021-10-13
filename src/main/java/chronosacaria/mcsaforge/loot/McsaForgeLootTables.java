package chronosacaria.mcsaforge.loot;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameter;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class McsaForgeLootTables extends LootModifier {
    private final ResourceLocation[] additionalTables;

    public McsaForgeLootTables(ILootCondition[] conditions, ResourceLocation[] additionalTables){
        super(conditions);
        this.additionalTables = additionalTables;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext ctx){
        List<ItemStack> newLoot = new ArrayList<ItemStack>();

        for (ResourceLocation tableLocation : additionalTables) {
            LootTable table = ctx.getLootTable(tableLocation);
            boolean compatible = true;

            for (LootParameter<?> param : table.getParameterSet().getRequiredParameters()) {
                if (!ctx.has(param)) {
                    compatible = false;

                    break;
                }
            }

            if (compatible && table != LootTable.EMPTY_LOOT_TABLE)
                table.recursiveGenerate(ctx, newLoot::add);
        }

        return newLoot.isEmpty() ? generatedLoot : newLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<McsaForgeLootTables> {
        @Override
        public McsaForgeLootTables read(ResourceLocation location, JsonObject object, ILootCondition[] lootConditions) {
            JsonArray tables = JSONUtils.getJsonArray(object, "tables");
            ResourceLocation[] tableList = new ResourceLocation[tables.size()];

            for (int i = 0; i < tables.size(); i++) {
                tableList[i] = new ResourceLocation(tables.get(i).getAsString());
            }

            return new McsaForgeLootTables(lootConditions, tableList);
        }

        @Override
        public JsonObject write(McsaForgeLootTables instance) {
            JsonObject json = makeConditions(instance.conditions);
            JsonArray tables = new JsonArray();

            for (ResourceLocation table : instance.additionalTables) {
                tables.add(table.toString());
            }

            json.add("tables", tables);
            json.addProperty("type", getRegistryName().toString());

            return json;
        }
    }
}

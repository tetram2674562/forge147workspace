package net.minecraft.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialLiquid extends Material {

   public MaterialLiquid(MapColor p_i3880_1_) {
      super(p_i3880_1_);
      this.func_76231_i();
      this.func_76219_n();
   }

   public boolean func_76224_d() {
      return true;
   }

   public boolean func_76230_c() {
      return false;
   }

   public boolean func_76220_a() {
      return false;
   }
}

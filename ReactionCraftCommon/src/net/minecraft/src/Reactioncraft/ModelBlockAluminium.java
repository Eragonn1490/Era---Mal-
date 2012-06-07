// Date: 22.05.2012 20:54:40
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package net.minecraft.src.Reactioncraft;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;
import net.minecraft.src.*;

public class ModelBlockAluminium extends ModelBase
{
  //fields
    ModelRenderer plank1;
    ModelRenderer plank2;
    ModelRenderer blAl1;
    ModelRenderer blAl11;
    ModelRenderer blAl12;
    ModelRenderer blAl2;
    ModelRenderer blAl21;
    ModelRenderer blAl22;
    ModelRenderer blAl3;
    ModelRenderer blAl31;
    ModelRenderer blAl32;
    ModelRenderer blAl4;
    ModelRenderer blAl41;
    ModelRenderer blAl42;
    ModelRenderer blAl5;
    ModelRenderer blAl51;
    ModelRenderer blAl52;
    ModelRenderer blAl6;
    ModelRenderer blAl61;
    ModelRenderer blAl62;
    ModelRenderer blAl7;
    ModelRenderer blAl71;
    ModelRenderer blAl72;
    ModelRenderer blAl8;
    ModelRenderer blAl81;
    ModelRenderer blAl82;
    ModelRenderer blAl9;
    ModelRenderer blAl91;
    ModelRenderer blAl92;
    ModelRenderer rope1;
    ModelRenderer rope2;
    ModelRenderer rope3;
    ModelRenderer rope4;
    ModelRenderer rope5;
    ModelRenderer rope6;
    ModelRenderer rope7;
    ModelRenderer rope8;
  
  public ModelBlockAluminium()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      plank1 = new ModelRenderer(this, 0, 0);
      plank1.addBox(-8F, 0F, -1F, 16, 1, 3);
      plank1.setRotationPoint(0F, 6.9F, -6.9F);
      plank1.setTextureSize(64, 64);
      plank1.mirror = true;
      setRotation(plank1, 0F, 0F, 0F);
      plank2 = new ModelRenderer(this, 0, 0);
      plank2.addBox(-8F, 0F, -1F, 16, 1, 3);
      plank2.setRotationPoint(0F, 6.9F, 5.9F);
      plank2.setTextureSize(64, 64);
      plank2.mirror = true;
      setRotation(plank2, 0F, 0F, 0F);
      blAl1 = new ModelRenderer(this, 0, 5);
      blAl1.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl1.setRotationPoint(-7.75F, 2F, -7F);
      blAl1.setTextureSize(64, 64);
      blAl1.mirror = true;
      setRotation(blAl1, 0F, 0F, 0F);
      blAl11 = new ModelRenderer(this, 45, 5);
      blAl11.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl11.setRotationPoint(-7.8F, 2F, -7.9F);
      blAl11.setTextureSize(64, 64);
      blAl11.mirror = true;
      setRotation(blAl11, 0F, 0F, 0F);
      blAl12 = new ModelRenderer(this, 45, 5);
      blAl12.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl12.setRotationPoint(-7.8F, 2F, 6.9F);
      blAl12.setTextureSize(64, 64);
      blAl12.mirror = true;
      setRotation(blAl12, 0F, 0F, 0F);
      blAl2 = new ModelRenderer(this, 0, 5);
      blAl2.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl2.setRotationPoint(-2.466667F, 2F, -7F);
      blAl2.setTextureSize(64, 64);
      blAl2.mirror = true;
      setRotation(blAl2, 0F, 0F, 0F);
      blAl21 = new ModelRenderer(this, 45, 5);
      blAl21.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl21.setRotationPoint(-2.533333F, 2F, 7F);
      blAl21.setTextureSize(64, 64);
      blAl21.mirror = true;
      setRotation(blAl21, 0F, 0F, 0F);
      blAl22 = new ModelRenderer(this, 45, 5);
      blAl22.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl22.setRotationPoint(-2.5F, 2F, -8F);
      blAl22.setTextureSize(64, 64);
      blAl22.mirror = true;
      setRotation(blAl22, 0F, 0F, 0F);
      blAl3 = new ModelRenderer(this, 0, 5);
      blAl3.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl3.setRotationPoint(2.75F, 2F, -7F);
      blAl3.setTextureSize(64, 64);
      blAl3.mirror = true;
      setRotation(blAl3, 0F, 0F, 0F);
      blAl31 = new ModelRenderer(this, 45, 5);
      blAl31.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl31.setRotationPoint(2.8F, 2F, 6.9F);
      blAl31.setTextureSize(64, 64);
      blAl31.mirror = true;
      setRotation(blAl31, 0F, 0F, 0F);
      blAl32 = new ModelRenderer(this, 45, 5);
      blAl32.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl32.setRotationPoint(2.8F, 2F, -7.9F);
      blAl32.setTextureSize(64, 64);
      blAl32.mirror = true;
      setRotation(blAl32, 0F, 0F, 0F);
      blAl4 = new ModelRenderer(this, 0, 25);
      blAl4.addBox(0F, 0F, 0F, 14, 5, 5);
      blAl4.setRotationPoint(-7F, -3F, 2.8F);
      blAl4.setTextureSize(64, 64);
      blAl4.mirror = true;
      setRotation(blAl4, 0F, 0F, 0F);
      blAl41 = new ModelRenderer(this, 45, 25);
      blAl41.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl41.setRotationPoint(-8F, -3F, 2.8F);
      blAl41.setTextureSize(64, 64);
      blAl41.mirror = true;
      setRotation(blAl41, 0F, 0F, 0F);
      blAl42 = new ModelRenderer(this, 45, 25);
      blAl42.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl42.setRotationPoint(7F, -3F, 2.8F);
      blAl42.setTextureSize(64, 64);
      blAl42.mirror = true;
      setRotation(blAl42, 0F, 0F, 0F);
      blAl5 = new ModelRenderer(this, 0, 25);
      blAl5.addBox(0F, 0F, 0F, 14, 5, 5);
      blAl5.setRotationPoint(-7F, -3F, -2.5F);
      blAl5.setTextureSize(64, 64);
      blAl5.mirror = true;
      setRotation(blAl5, 0F, 0F, 0F);
      blAl51 = new ModelRenderer(this, 45, 25);
      blAl51.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl51.setRotationPoint(-8F, -3F, -2.466667F);
      blAl51.setTextureSize(64, 64);
      blAl51.mirror = true;
      setRotation(blAl51, 0F, 0F, 0F);
      blAl52 = new ModelRenderer(this, 45, 25);
      blAl52.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl52.setRotationPoint(7F, -3F, -2.5F);
      blAl52.setTextureSize(64, 64);
      blAl52.mirror = true;
      setRotation(blAl52, 0F, 0F, 0F);
      blAl6 = new ModelRenderer(this, 0, 25);
      blAl6.addBox(0F, 0F, 0F, 14, 5, 5);
      blAl6.setRotationPoint(-7F, -3F, -7.8F);
      blAl6.setTextureSize(64, 64);
      blAl6.mirror = true;
      setRotation(blAl6, 0F, 0F, 0F);
      blAl61 = new ModelRenderer(this, 45, 25);
      blAl61.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl61.setRotationPoint(-8F, -3F, -7.8F);
      blAl61.setTextureSize(64, 64);
      blAl61.mirror = true;
      setRotation(blAl61, 0F, 0F, 0F);
      blAl62 = new ModelRenderer(this, 45, 25);
      blAl62.addBox(0F, 0F, 0F, 1, 2, 5);
      blAl62.setRotationPoint(7F, -3F, -7.8F);
      blAl62.setTextureSize(64, 64);
      blAl62.mirror = true;
      setRotation(blAl62, 0F, 0F, 0F);
      blAl7 = new ModelRenderer(this, 0, 5);
      blAl7.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl7.setRotationPoint(2.8F, -7.9F, -7F);
      blAl7.setTextureSize(64, 64);
      blAl7.mirror = true;
      setRotation(blAl7, 0F, 0F, 0F);
      blAl71 = new ModelRenderer(this, 45, 5);
      blAl71.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl71.setRotationPoint(2.8F, -7.9F, 6.9F);
      blAl71.setTextureSize(64, 64);
      blAl71.mirror = true;
      setRotation(blAl71, 0F, 0F, 0F);
      blAl72 = new ModelRenderer(this, 45, 5);
      blAl72.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl72.setRotationPoint(2.8F, -7.9F, -7.9F);
      blAl72.setTextureSize(64, 64);
      blAl72.mirror = true;
      setRotation(blAl72, 0F, 0F, 0F);
      blAl8 = new ModelRenderer(this, 0, 5);
      blAl8.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl8.setRotationPoint(-2.5F, -7.9F, -7F);
      blAl8.setTextureSize(64, 64);
      blAl8.mirror = true;
      setRotation(blAl8, 0F, 0F, 0F);
      blAl81 = new ModelRenderer(this, 45, 5);
      blAl81.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl81.setRotationPoint(-2.466667F, -7.9F, 7F);
      blAl81.setTextureSize(64, 64);
      blAl81.mirror = true;
      setRotation(blAl81, 0F, 0F, 0F);
      blAl82 = new ModelRenderer(this, 45, 5);
      blAl82.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl82.setRotationPoint(-2.533333F, -7.9F, -8F);
      blAl82.setTextureSize(64, 64);
      blAl82.mirror = true;
      setRotation(blAl82, 0F, 0F, 0F);
      blAl9 = new ModelRenderer(this, 0, 5);
      blAl9.addBox(0F, 0F, 0F, 5, 5, 14);
      blAl9.setRotationPoint(-7.8F, -7.9F, -7F);
      blAl9.setTextureSize(64, 64);
      blAl9.mirror = true;
      setRotation(blAl9, 0F, 0F, 0F);
      blAl91 = new ModelRenderer(this, 45, 5);
      blAl91.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl91.setRotationPoint(-7.8F, -7.9F, 6.9F);
      blAl91.setTextureSize(64, 64);
      blAl91.mirror = true;
      setRotation(blAl91, 0F, 0F, 0F);
      blAl92 = new ModelRenderer(this, 45, 5);
      blAl92.addBox(0F, 0F, 0F, 5, 2, 1);
      blAl92.setRotationPoint(-7.8F, -7.9F, -7.9F);
      blAl92.setTextureSize(64, 64);
      blAl92.mirror = true;
      setRotation(blAl92, 0F, 0F, 0F);
      rope1 = new ModelRenderer(this, 24, 0);
      rope1.addBox(0F, 0F, 0F, 1, 0, 16);
      rope1.setRotationPoint(5F, -8F, -8F);
      rope1.setTextureSize(64, 64);
      rope1.mirror = true;
      setRotation(rope1, 0F, 0F, 0F);
      rope2 = new ModelRenderer(this, 25, 0);
      rope2.addBox(0F, 0F, 0F, 1, 0, 16);
      rope2.setRotationPoint(-6F, -8F, -8F);
      rope2.setTextureSize(64, 64);
      rope2.mirror = true;
      setRotation(rope2, 0F, 0F, 0F);
      rope3 = new ModelRenderer(this, 40, 0);
      rope3.addBox(0F, 0F, 0F, 1, 16, 0);
      rope3.setRotationPoint(5F, -8F, 8F);
      rope3.setTextureSize(64, 64);
      rope3.mirror = true;
      setRotation(rope3, 0F, 0F, 0F);
      rope4 = new ModelRenderer(this, 40, 0);
      rope4.addBox(0F, 0F, 0F, 1, 16, 0);
      rope4.setRotationPoint(-6F, -8F, 8F);
      rope4.setTextureSize(64, 64);
      rope4.mirror = true;
      setRotation(rope4, 0F, 0F, 0F);
      rope5 = new ModelRenderer(this, 40, 0);
      rope5.addBox(0F, 0F, 0F, 1, 16, 0);
      rope5.setRotationPoint(-6F, -8F, -8F);
      rope5.setTextureSize(64, 64);
      rope5.mirror = true;
      setRotation(rope5, 0F, 0F, 0F);
      rope6 = new ModelRenderer(this, 40, 0);
      rope6.addBox(0F, 0F, 0F, 1, 16, 0);
      rope6.setRotationPoint(5F, -8F, -8F);
      rope6.setTextureSize(64, 64);
      rope6.mirror = true;
      setRotation(rope6, 0F, 0F, 0F);
      rope7 = new ModelRenderer(this, 25, 0);
      rope7.addBox(0F, 0F, 0F, 1, 0, 16);
      rope7.setRotationPoint(5F, 8F, -8F);
      rope7.setTextureSize(64, 64);
      rope7.mirror = true;
      setRotation(rope7, 0F, 0F, 0F);
      rope8 = new ModelRenderer(this, 25, 0);
      rope8.addBox(0F, 0F, 0F, 1, 0, 16);
      rope8.setRotationPoint(-6F, 8F, -8F);
      rope8.setTextureSize(64, 64);
      rope8.mirror = true;
      setRotation(rope8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    plank1.render(f5);
    plank2.render(f5);
    blAl1.render(f5);
    blAl11.render(f5);
    blAl12.render(f5);
    blAl2.render(f5);
    blAl21.render(f5);
    blAl22.render(f5);
    blAl3.render(f5);
    blAl31.render(f5);
    blAl32.render(f5);
    blAl4.render(f5);
    blAl41.render(f5);
    blAl42.render(f5);
    blAl5.render(f5);
    blAl51.render(f5);
    blAl52.render(f5);
    blAl6.render(f5);
    blAl61.render(f5);
    blAl62.render(f5);
    blAl7.render(f5);
    blAl71.render(f5);
    blAl72.render(f5);
    blAl8.render(f5);
    blAl81.render(f5);
    blAl82.render(f5);
    blAl9.render(f5);
    blAl91.render(f5);
    blAl92.render(f5);
    rope1.render(f5);
    rope2.render(f5);
    rope3.render(f5);
    rope4.render(f5);
    rope5.render(f5);
    rope6.render(f5);
    rope7.render(f5);
    rope8.render(f5);
  }
  
  public void renderModel (float f1)
  {
	    plank1.render(f1);
	    plank2.render(f1);
	    blAl1.render(f1);
	    blAl11.render(f1);
	    blAl12.render(f1);
	    blAl2.render(f1);
	    blAl21.render(f1);
	    blAl22.render(f1);
	    blAl3.render(f1);
	    blAl31.render(f1);
	    blAl32.render(f1);
	    blAl4.render(f1);
	    blAl41.render(f1);
	    blAl42.render(f1);
	    blAl5.render(f1);
	    blAl51.render(f1);
	    blAl52.render(f1);
	    blAl6.render(f1);
	    blAl61.render(f1);
	    blAl62.render(f1);
	    blAl7.render(f1);
	    blAl71.render(f1);
	    blAl72.render(f1);
	    blAl8.render(f1);
	    blAl81.render(f1);
	    blAl82.render(f1);
	    blAl9.render(f1);
	    blAl91.render(f1);
	    blAl92.render(f1);
	    rope1.render(f1);
	    rope2.render(f1);
	    rope3.render(f1);
	    rope4.render(f1);
	    rope5.render(f1);
	    rope6.render(f1);
	    rope7.render(f1);
	    rope8.render(f1);
  }
  
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}

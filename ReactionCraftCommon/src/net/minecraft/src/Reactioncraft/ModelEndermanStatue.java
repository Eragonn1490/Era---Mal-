// Date: 6/2/2012 3:00:58 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package net.minecraft.src.Reactioncraft;
import net.minecraft.src.*;

public class ModelEndermanStatue extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Headwear;
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer Hello;
  
  public ModelEndermanStatue()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-4F, -8F, -4F, 8, 8, 8);
      Head.setRotationPoint(0F, -14F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Headwear = new ModelRenderer(this, 0, 16);
      Headwear.addBox(-4F, -8F, -4F, 8, 8, 8);
      Headwear.setRotationPoint(0F, -14F, 0F);
      Headwear.setTextureSize(64, 32);
      Headwear.mirror = true;
      setRotation(Headwear, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 32, 16);
      Body.addBox(-4F, 0F, -2F, 8, 12, 4);
      Body.setRotationPoint(0F, -14F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 56, 0);
      RightArm.addBox(-1F, -2F, -1F, 2, 30, 2);
      RightArm.setRotationPoint(-5F, -12F, 0F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = true;
      setRotation(RightArm, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 56, 0);
      LeftArm.mirror = true;
      LeftArm.addBox(-1F, -2F, -1F, 2, 30, 2);
      LeftArm.setRotationPoint(5F, -12F, 0F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0F, 0F, 0F);
      LeftArm.mirror = false;
      RightLeg = new ModelRenderer(this, 56, 0);
      RightLeg.addBox(-1F, 0F, -1F, 2, 30, 2);
      RightLeg.setRotationPoint(-2F, -2F, 0F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 56, 0);
      LeftLeg.mirror = true;
      LeftLeg.addBox(-1F, 0F, -1F, 2, 30, 2);
      LeftLeg.setRotationPoint(2F, -2F, 0F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftLeg.mirror = false;
      Hello = new ModelRenderer(this, 0, 0);
      Hello.addBox(0F, 0F, 0F, 1, 1, 1);
      Hello.setRotationPoint(0F, -19F, 0F);
      Hello.setTextureSize(64, 32);
      Hello.mirror = true;
      setRotation(Hello, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Headwear.render(f5);
    Body.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightLeg.render(f5);
    LeftLeg.render(f5);
    Hello.render(f5);
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

public void renderModel(float f1) {
	Head.render(f1);
    Headwear.render(f1);
    Body.render(f1);
    RightArm.render(f1);
    LeftArm.render(f1);
    RightLeg.render(f1);
    LeftLeg.render(f1);
    Hello.render(f1);
	// TODO Auto-generated method stub
	
}

}

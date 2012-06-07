package net.minecraft.src.Reactioncraft;

import org.lwjgl.opengl.GL11;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntitySpecialRenderer;

public class CowStatueRender extends TileEntitySpecialRenderer
{
	public CowStatueRender()
	{
		aModel = new ModelCowStatue();
	}
	
	public void renderAModelAt(TileEntityCowStatue tileentity1, double d, double d1, double d2, float f)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d + 0.5F, (float) d1 + 0.5F, (float) d2 + 0.5F);
		GL11.glRotatef(180, 0, 0, 180);
		bindTextureByName("/reactioncraft/rcs/statues/skeletonstatue.png");
	    GL11.glPushMatrix();
	    aModel.renderModel(0.0625F);
	    GL11.glPopMatrix();
	    GL11.glPopMatrix();
	}
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityCowStatue) tileentity, d, d1, d2,f); 
	}
	
	
	
	private ModelCowStatue aModel;
}

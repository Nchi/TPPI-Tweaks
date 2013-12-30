package tppitweaks.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import tppitweaks.TPPITweaks;

public class GuiHelper {
	
	public static void doBookGUI(EntityPlayer player, ItemStack stack, boolean par3) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiScreenBook(player, stack, par3));
	}
	
	public static void doDownloaderGUI() {
		Minecraft.getMinecraft().displayGuiScreen(new UpdateGui(Minecraft.getMinecraft().currentScreen, TPPITweaks.getModFlags()));
	}	
	
	public static boolean shouldLoadDownloaderGUI() {
		
		//TODO: Grab the config option that'll trigger this event
		
		/*if(config stuff says don't do it) {
			return false;
		}*/
		
		for(boolean b : TPPITweaks.getModFlags()) {
			if(!b) {
				return true;
			}
		}
		return false;
		
	}
	
}
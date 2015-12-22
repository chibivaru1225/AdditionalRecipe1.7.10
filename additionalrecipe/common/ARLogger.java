package chibivaru.additionalrecipe.common;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import chibivaru.additionalrecipe.AdditionalRecipe;

import cpw.mods.fml.common.FMLLog;

public class ARLogger
{
	public static Logger logger = LogManager.getLogger(AdditionalRecipe.MODNAME);
	public static void loadingModInfo(String modid) {
		ARLogger.logger.trace("Now checking other mod :" + modid);
	}

	public static void loadedModInfo(String modid) {
		ARLogger.logger.trace("Succeeded to check other mod :" + modid);
	}

	public static void failLoadingModInfo(String modid) {
		ARLogger.logger.error("Failed to check other mod :" + modid);
	}

	public static void trace(String msg) {
		ARLogger.logger.trace(msg);
	}

	public static void info(String msg) {
		ARLogger.logger.info(msg);
	}

	public static void warn(String msg) {
		ARLogger.logger.warn(msg);
	}
	
}

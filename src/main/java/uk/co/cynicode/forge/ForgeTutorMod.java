package uk.co.cynicode.forge;
/**
 * Copyright 2014 M. D. Ball (m.d.ball2@ncl.ac.uk)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import cpw.mods.fml.common.Mod;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

/**
 * Class Name - ForgeTutorMod
 * Package - uk.co.cynicode.forge
 * Desc of Class - Central class for the Forge Tutor Modification
 * Author(s) - M. D. Ball
 * Last Mod: 22/12/2014
 */
@Mod(modid = "ForgeTutorMod", name = "Forge Tutor Mod", version = "1.0")
public class ForgeTutorMod {

	public static final boolean DEBUG_MODE = false;

	private static Logger logger;

	@Mod.Instance
	public static ForgeTutorMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent pie) {
		logger = pie.getModLog();
		logger.info("Forge Tutor Mod is in pre-init stage!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent ie) {
		logger.info("Forge Tutor Mod is in init stage!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent pie) {
		logger.info("Forge Tutor Mod is in post-init stage!");
	}

	public static Logger getLogger() {
		return logger;
	}

}

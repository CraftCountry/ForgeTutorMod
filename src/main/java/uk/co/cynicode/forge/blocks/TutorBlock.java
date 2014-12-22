package uk.co.cynicode.forge.blocks;
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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import uk.co.cynicode.forge.reference.Reference;

/**
 * Class Name - TutorBlock
 * Package - uk.co.cynicode.forge.blocks
 * Desc of Class - ...
 * Author(s) - M. D. Ball
 * Last Mod: 22/12/2014
 */
public class TutorBlock extends Block {

	public TutorBlock(Material block) {
		super(block);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public TutorBlock() {
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format(
				"blocks.%s:%s", Reference.MOD_ID.toLowerCase(),
				getUnwrappedUnlocalizedName(super.getUnlocalizedName())
		);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(
				String.format(
						"%s",
						getUnwrappedUnlocalizedName(this.getUnlocalizedName())
				)
		);
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}

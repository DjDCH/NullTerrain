package uk.me.elizabethmyers.nullterrain;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class NullTerrain extends JavaPlugin
{
	public void onDisable()
	{
	}

	public void onEnable()
	{
	}

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new NullChunkGenerator();
	}
}


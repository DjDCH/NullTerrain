package uk.me.elizabethmyers.nullterrain;

import java.util.List;
import java.util.logging.Logger;
import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
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


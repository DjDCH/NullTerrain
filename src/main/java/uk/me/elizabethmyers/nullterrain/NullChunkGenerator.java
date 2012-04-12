package uk.me.elizabethmyers.nullterrain;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.World;

public class NullChunkGenerator extends ChunkGenerator
{
	protected boolean nofixedspawn = false;

	public NullChunkGenerator(boolean nofixedspawn)
	{
		this.nofixedspawn = nofixedspawn;
	}

	public byte[] generate(World world, Random random, int cx, int cz)
	{
		return new byte[32768];
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		if (this.nofixedspawn) {
			return null;
		}

		// Sane default --Elizabeth
		return new Location(world, 0, 64, 0);
	}
}

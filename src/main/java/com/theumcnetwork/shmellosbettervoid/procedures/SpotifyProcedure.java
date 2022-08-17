package com.theumcnetwork.shmellosbettervoid.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class SpotifyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					new TextComponent("Its Mr. Shmello's Spotify page is available: https://open.spotify.com/artist/171cFzCKKsQ6FCkju5zuXk"),
					(false));
	}
}

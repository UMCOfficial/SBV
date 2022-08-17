package com.theumcnetwork.shmellosbettervoid.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class DownloadProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					new TextComponent("Download SBV Only on curseforge: https://www.curseforge.com/minecraft/mc-mods/shmellos-better-void"), (false));
	}
}

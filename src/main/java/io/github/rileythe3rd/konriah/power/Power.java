package io.github.rileythe3rd.konriah.power;


import org.bukkit.entity.Entity;

public abstract class Power {

    /**
     * Gets the power's name.
     *
     * @return The power's name.
     */

    public abstract String getName();


    /**
     * Gets a brief description of how this power works.
     *
     * @return The power's description.
     */

    public abstract String getDescription();

    /**
     * Gets the cooldown that will be applied to a player after this power is used.
     *
     * @return This power's cooldown.
     */

    public abstract long getCooldown();

    /**
     * Activates the power with the given user.
     * Note: This should only be called indirectly as it will not fire any event or apply cooldowns.
     *
     * @param entity The entity using this power.
     * @return Whether or not cooldown should be applied.
     */

    public abstract boolean activate(Entity entity);



}
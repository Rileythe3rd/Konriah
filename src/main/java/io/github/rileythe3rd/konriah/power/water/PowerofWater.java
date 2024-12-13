package io.github.rileythe3rd.konriah.power.water;

import io.github.rileythe3rd.konriah.power.Power;
import org.bukkit.entity.Entity;
import org.bukkit.event.Listener;

import java.util.concurrent.TimeUnit;

public class PowerofWater extends Power implements Listener {

    @Override
    public String getName() {
        return ("Power of Water");
    }

    @Override
    public String getDescription() {
        return ("Float and explode");
    }

    @Override
    public long getCooldown() {
        return (TimeUnit.SECONDS.toMillis(30));
    }

    /** This is where the first power behaviour will be coded **/
    @Override
    public boolean activate(Entity entity) {
        return (true);


    }

}

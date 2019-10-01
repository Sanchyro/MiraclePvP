package me.sahustei.miraclepvp.data.suffix;

import org.bukkit.Material;

import java.util.UUID;

public class Suffix {

    private UUID uuid;
    private String name;
    private String suffix;
    private Integer cost,sell;
    private Material icon;

    public Suffix(String name, String suffix, Material icon, int cost, int sell) {
        this.uuid = UUID.randomUUID();
        this.icon = icon;
        this.name = name;
        this.suffix = suffix;
        this.cost = cost;
        this.sell = sell;
    }

    public UUID getUuid()
    {
        return this.uuid;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Material getIcon()
    {
        return this.icon;
    }

    public void setIcon(Material icon)
    {
        this.icon = icon;
    }

    public int getCost()
    {
        return this.cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public int getSell()
    {
        return this.sell;
    }

    public void setSell(int sell)
    {
        this.sell = sell;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

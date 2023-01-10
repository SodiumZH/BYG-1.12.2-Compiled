// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   bygVariables.java

package net.mcreator.byg;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

// Referenced classes of package net.mcreator.byg:
//            bygVariables, byg

public static class bygVariables$MapVariables extends WorldSavedData
{

    public void func_76184_a(NBTTagCompound nbttagcompound)
    {
    }

    public NBTTagCompound func_189551_b(NBTTagCompound nbt)
    {
        return nbt;
    }

    public void syncData(World world)
    {
        func_76185_a();
        if(world.field_72995_K)
            byg.PACKET_HANDLER.sendToServer(new aSyncMessage(0, this));
        else
            byg.PACKET_HANDLER.sendToAll(new aSyncMessage(0, this));
    }

    public static bygVariables$MapVariables get(World world)
    {
        bygVariables$MapVariables instance = (bygVariables$MapVariables)world.func_175693_T().func_75742_a(net/mcreator/byg/bygVariables$MapVariables, "byg_mapvars");
        if(instance == null)
        {
            instance = new bygVariables$MapVariables();
            world.func_175693_T().func_75745_a("byg_mapvars", instance);
        }
        return instance;
    }

    public static final String DATA_NAME = "byg_mapvars";

    public bygVariables$MapVariables()
    {
        super("byg_mapvars");
    }

    public bygVariables$MapVariables(String s)
    {
        super(s);
    }
}

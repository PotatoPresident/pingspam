package me.basiqueevangelist.pingspam.client.network;

import java.util.ArrayList;
import java.util.List;

public class ServerData {
    public boolean canPingEveryone;
    public boolean canPingOnline;
    public boolean canPingOffline;
    public boolean canPingPlayers;
    public List<String> possibleNames = new ArrayList<>();
}

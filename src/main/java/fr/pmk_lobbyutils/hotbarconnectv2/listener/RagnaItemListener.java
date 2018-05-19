package fr.pmk_lobbyutils.hotbarconnectv2.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

import fr.pmk_lobbyutils.hotbarconnect.bungee.HotBarBungee;
import fr.pmk_lobbyutils.hotbarconnectv2.utils.IHotBarItemListener;

public class RagnaItemListener implements IHotBarItemListener {
	
	private static String state = "on";
	private static String raison = "";
	
	@Override
	public void callItem(PlayerInteractEvent event) {
		// TODO Auto-generated method stub
		
		Player p = event.getPlayer();
		
		// item ragnamod connexion
		
		if(state.equals("on")) {
			
			// requete de connexion
			p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aRequ�te de connexion au serveur �2�o�n" + "ragna1" + "�r�a bien envoy� !");
			p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aMerci de patienter le temps que le serveur confirme la connexion ...");
			HotBarBungee.connectServer(p, "ragna1");
			
		}else if(state.equals("prime")) {
			
			if(p.hasPermission("server.ragna1.prime")) {
				// connexion accept�
				// requete de connexion
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aRequ�te de connexion au serveur �2�o�n" + "ragna1" + "�r�a bien envoy� !");
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aMerci de patienter le temps que le serveur confirme la connexion ...");
				HotBarBungee.connectServer(p, "ragna1");
				
			}else {
				// connexion refus�
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �cRequ�te de connexion au serveur �4�o�n" + "ragna1" + "�r�c non envoy�, permission insuffisante !");
			}
			
		}else if(state.equals("dev")) {
			
			if(p.hasPermission("server.ragna1.dev")) {
				// connexion accept�
				// requete de connexion
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aRequ�te de connexion au serveur �2�o�n" + "ragna1" + "�r�a bien envoy� !");
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �aMerci de patienter le temps que le serveur confirme la connexion ...");
				HotBarBungee.connectServer(p, "ragna1");
				
			}else {
				// connexion refus�
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �cRequ�te de connexion au serveur �4�o�n" + "ragna1" + "�r�c non envoy�, serveur indisponible !");
				p.sendMessage("�e�l[�r�6PumpMyCord�r�e�l]�r �cRaison : �4�o�n" + raison);
				
			}
			
		}else if(state.equals("off")) {
			
			// connexion refus�
			
		}
			
		
		
		
		
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		RagnaItemListener.state = state;
	}

	public static String getRaison() {
		return raison;
	}

	public static void setRaison(String raison) {
		RagnaItemListener.raison = raison;
	}
	
}

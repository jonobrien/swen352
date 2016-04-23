/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import junit.framework.TestCase;


/**
 *
 * @author Matthew
 */
public class PlayerTest extends TestCase {
    int AI = 1;
    int color = 0xFF000000;
    int color2 = 0xFFFFFFFF;
    String name = "TestPlayer";
    String name2 = "TestPlayer2";
    Continent continent = new Continent("Id1", "Continent_1" , color, 1);
    Country country1 = new Country(color, "Id2", "Country_1", continent, 0, 0);
	Country country2 = new Country(color, "Id3", "Country_2", continent, 0, 0);
    Player player = new Player(AI, name, color, "localhost");
	Player player2 = new Player(AI, name2, color2, "localhost");
	ArrayList<Player> playerselim = new ArrayList<Player>();
	Mission testmission = new Mission(player, 1, 1, continent, continent, continent, "Mission1");
	ArrayList<Country> territoriesOwned = new ArrayList<Country>();
	ArrayList<Card> cards = new ArrayList<Card>();
	Card card = new Card("Cavalry", country1);
	
    @Override
    public void setUp(){
    }

    public void testPrintTest() {
		System.out.println("Running PlayerTest");
    }
    
	public void testAddPlayersEliminated_AND_GetPlayersEliminated(){
		assertEquals(playerselim, player.getPlayersEliminated());
		player.addPlayersEliminated(player2);
		playerselim.add(player2);
		assertEquals(playerselim, player.getPlayersEliminated());
	}
	
	public void testGiveCard_AND_GetCard_AND_TakeCard(){
		player.giveCard(card);
		cards.add(card);
		assertEquals(cards, player.getCards());
		cards.remove(0);
		player.takeCard();
		assertEquals(cards, player.getCards());
	}
	
	public void testGetNoArmies(){
		player.newCountry(country1);
		country1.addArmy();
		assertEquals(1, player.getNoArmies());
	}

    public void testGetAddress(){
	assertEquals("localhost", player.getAddress());
    }
    
	public void testGetAutoDefend(){
		assertEquals(true,player.getAutoDefend());
	}
	
	public void testGetAutoEndGo(){
		assertEquals(true,player.getAutoEndGo());
	}
	
	public void testGetCapital_AND_SetCapital(){
		player.newCountry(country1);
		player.setCapital(country1);
		assertEquals(country1, player.getCapital());
	}
	
    public void testGetColor(){
	assertEquals(color, player.getColor());
    }
	
	public void testGetName(){
		assertEquals(name, player.getName());
	}
	
	public void testGetNoTerritoriesOwned(){
		player.newCountry(country1);
		assertEquals(1, player.getNoTerritoriesOwned());
	}
	
    public void testGetStatistics(){
		Statistic stat = new Statistic();
		player.nextTurn();
		assertEquals(2, (Statistic)player.getStatistics().get(0));
    }
    
	public void testGetTerritoriesOwned(){
		player.newCountry(country1);
		territoriesOwned.add(country1);
		assertEquals(territoriesOwned, player.getTerritoriesOwned());
	}
	
	public void testGetType(){
		assertEquals(AI, player.getType());
	}
	
	public void testIsAlive(){
		assertEquals(false, player.isAlive());
		player.newCountry(country1);
		assertEquals(true, player.isAlive());
		player.lostCountry(country1);
		player.addArmies(1);
		assertEquals(true, player.isAlive());
		player.newCountry(country1);
		assertEquals(true, player.isAlive());
		
	}
	
	public void testLostCountry(){
		player.lostCountry(country1);
		assertEquals(0, player.getNoTerritoriesOwned());
	}
	
	public void testSetAddress(){
		player.setAddress("localhost:2");
		assertEquals("localhost:2", player.getAddress());
	}
	
	public void testSetAutoDefend(){
		player.setAutoDefend(false);
		assertEquals(false, player.getAutoDefend());
	}
	
	public void testSetAutoEndGo(){
		player.setAutoEndGo(false);
		assertEquals(false, player.getAutoEndGo());
	}
	
	public void testGetMission_AND_SetMission(){
		assertEquals(null, player.getMission());
		player.setMission(testmission);
		assertEquals(testmission, player.getMission());
	}
	
	public void testLoseExtraArmy(){
		player.addArmies(1);
		assertEquals(1, player.getExtraArmies());
		player.loseExtraArmy(1);
		assertEquals(0, player.getExtraArmies());
		//taking it one step further
		player.loseExtraArmy(1);
		assertEquals(0, player.getExtraArmies()); //this fails; potential bug
	}
	
	public void testNewCountry(){
		player.newCountry(country1);
		player.newCountry(country2);
		assertEquals(2, player.getNoTerritoriesOwned());
	}
	
	public void nextTurn(){
		player.nextTurn();
	}
	
    public void testRename(){
		player.rename(name2);
		assertEquals(name2, player.toString());
    }
    
    public void testSetColor(){
		player.setColor(color2);
		assertEquals(color2, player.getColor());
    }

	public void testSetType(){
		player.setType(2);
		assertEquals(2, player.getType());
	}
	
	public void testToString(){
		assertEquals( name, player.toString());
    }
	
	public void testTradeInCards(){
		player.giveCard(card);
		player.giveCard(card);
		player.giveCard(card);
		cards.add(card);
		cards.add(card);
		cards.add(card);
		//this shouldn't be allowed either haha
		player.tradeInCards(card, card, card);
		cards.clear();
		assertEquals(cards, player.getCards());
		Statistic stat = player.getStatistics().get(player.getStatistics().size());
		System.out.println(stat.get(StatType.ATTACKS));
	}
}

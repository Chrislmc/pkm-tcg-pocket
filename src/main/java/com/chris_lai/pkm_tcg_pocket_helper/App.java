package com.chris_lai.pkm_tcg_pocket_helper;

import com.chris_lai.pkm_tcg_pocket_helper.card.Card;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("com.chris_lai.pkm_tcg_pocket_helper.App");
        Card firstCard = new Card("001", "Bulbasaur", "Mewtwo");
        firstCard.log();
    }
}

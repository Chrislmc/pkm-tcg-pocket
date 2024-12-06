package com.chris_lai.pkm_tcg_pocket_helper.cardList;

import java.util.ArrayList;
import java.util.Arrays;
import com.chris_lai.pkm_tcg_pocket_helper.card.Card;
import com.chris_lai.pkm_tcg_pocket_helper.types.cardPack.CardPackEnum;

public class CardList {
    ArrayList<Card> cardDataList =
            new ArrayList<Card>(Arrays.asList(new Card("001", "Bulbasaur", CardPackEnum.MEWTWO),
                    new Card("002", "Ivysaur", CardPackEnum.MEWTWO),
                    new Card("003", "Venusaur", CardPackEnum.MEWTWO),
                    new Card("004", "Venusaur ex", CardPackEnum.MEWTWO),
                    new Card("005", "Caterpie", CardPackEnum.PIKACHU),
                    new Card("006", "Metapod", CardPackEnum.PIKACHU),
                    new Card("007", "Butterfree", CardPackEnum.PIKACHU),
                    new Card("008", "Weedle", CardPackEnum.MEWTWO),
                    new Card("009", "Kakuna", CardPackEnum.MEWTWO),
                    new Card("010", "Beedrill", CardPackEnum.MEWTWO)));

    public void log() {
        for (Card card : cardDataList) {
            card.log();
        }
    }
}

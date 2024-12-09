package com.chris_lai.pkm_tcg_pocket_helper.types.rarity;

public enum RarityEnum {
    NORMAL_ONE("♢"),
    NORMAL_TWO("♢♢"),
    NORMAL_THREE("♢♢♢"),
    NORMAL_FOUR("♢♢♢♢"),
    STAR_ONE("☆"),
    STAR_TWO("☆☆"),
    CROWN("♛");

    private String rarityDesc;

    private RarityEnum(String rarityDesc) {
        this.rarityDesc = rarityDesc;
    }

    public String getRarityDesc() {
        return rarityDesc;
    }
}

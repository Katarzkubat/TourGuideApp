package com.example.katarzkubat.tourguideapp;

public class Place {
    private int pname;

    private int paddress;

    private int pImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(int name, int address) {
        pname = name;
        paddress = address;
    }

    public Place(int name, int address, int ImageResourceId) {
        pname = name;
        paddress = address;
        pImageResourceId = ImageResourceId;
    }

    public int getName() {
        return pname;
    }

    public int getAddress() {
        return paddress;
    }

    public int getImageResourceId() {
        return pImageResourceId;
    }

    public boolean hasImage() {
        return pImageResourceId != NO_IMAGE_PROVIDED;
    }
}


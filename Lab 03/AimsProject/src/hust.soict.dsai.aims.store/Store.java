package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < 100) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD " + dvd.getTitle() + " added to store.");
        } else {
            System.out.println("Store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD " + dvd.getTitle() + " removed from store.");
                return;
            }
        }
        System.out.println("DVD not found in store.");
    }
}
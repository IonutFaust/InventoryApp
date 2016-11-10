package com.exampledb.android.inventoryapp.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Catrina on 04/11/2016.
 */
public class InventoryContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor
    private InventoryContract() {
    }


 //   The "Content authority" is a name for the entire content provider, similar to the
 //    relationship between a domain name and its website.

    public static final String CONTENT_AUTHORITY = "com.example.android.inventory";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_INVENTORY = "inventory";

    public static final class InventoryEntry implements BaseColumns {
        /** The content URI to access the inventory data in the provider */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORY);

        //The MIME type of the {@link #CONTENT_URI} for a list of inventory.
        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;

        //MIME type for an individual item
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;

        //Table column titles
        public static final String TABLE_NAME = "Inventory";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_ITEM_NAME = "Name";
        public static final String COLUMN_ITEM_DESC = "Description";
        public static final String COLUMN_ITEM_SALES = "Sales";
        public static final String COLUMN_ITEM_STOCK = "Stock";
        public static final String COLUMN_ITEM_PRICE = "Price";
        public static final String COLUMN_ITEM_IMG = "Image";
    }
}

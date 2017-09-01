package biz.africanbib.Tools;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import biz.africanbib.Models.PreviousBusiness;

/**
 * Created by Balpreet on 10/9/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static long CURRENT_COMPANY_ID = -1;

    public static long getCurrentCompanyId() {
        return CURRENT_COMPANY_ID;
    }

    public static void setCurrentCompanyId(long id) {
        CURRENT_COMPANY_ID = id;
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    String TAG = "DBHelper";
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "ABIBDatabase";

    //Table Companies
    public static final String TABLE_COMPANY_PROFILE = "TableCompanyProfile";
    public static final String TABLE_COMPANY_CONTACT = "TableCompanyContact";
    public static final String TABLE_COMPANY_POSTAL_ADDRESS = "TableCompanyPostalAddress";
    public static final String TABLE_COMPANY_PHYSICAL_ADDRESS = "TableCompanyPhysicalAddress";
    public static final String TABLE_COMPANY_SPECIFIC_INFORMATION = "TableCompanySpecificInformation";
    public static final String TABLE_OFFERS = "TableOffers";
    public static final String TABLE_NEEDS = "TableNeeds";
    public static final String TABLE_OWNERS_MANAGERS_SUBSIDIARIES_REFERENCE = "TableOwners";
    public static final String TABLE_ACADEMIC_BACKGROUND = "TableAcademicBackground";
    public static final String TABLE_PROFESSIONAL_BACKGROUND = "TableProfessionalBackground";
    public static final String TABLE_AFFILIATION = "TableAffiliation";
    public static final String TABLE_REFERENCE_SPECIFIC_INFORMATION = "TableReferenceSpecificInformation";
    public static final String TABLE_SUBSIDIARY_SPECIFIC_INFORMATION = "TableSubsidiarySpecificInformation";
    public static final String TABLE_SERVICES = "TableServices";
    public static final String TABLE_PRODUCTS_AND_PRODUCT_DETAILS = "TableProducts";
    public static final String TABLE_PRODUCT_DETAILS = "TableProductDetails";
    public static final String TABLE_COMPANY_INDICATORS = "TableCompanyIndicators";
    public static final String TABLE_AWARDS = "TableAwards";
    public static final String TABLE_LATEST_NEWS = "TableLatestNews";
    public static final String TABLE_BUSINESS_CORRESPONDING_LANGUAGES = "TableBusinessCorrespondingLanguages";
    public static final String TABLE_SECTORS = "TableSectors";
    public static final String TABLE_SOURCE_OF_DATA = "TableSourceofData";


    public static final String COLUMN_COMPANY_ID = "COLUMN_COMPANY_ID";
    public static final String COLUMN_COMPANY_NAME = "COLUMN_COMPANY_NAME";
    public static final String COLUMN_REGISTERATION_NO = "COLUMN_REGISTERATION_NO";
    public static final String COLUMN_LOGO = "COLUMN_LOGO";
    public static final String COLUMN_KEYVISUAL_PHOTO = "COLUMN_KEYVISUAL_PHOTO";
    public static final String COLUMN_LOGO_NOTE = "COLUMN_LOGO_NOTE";
    public static final String COLUMN_KEYVISUAL_NOTE = "COLUMN_KEYVISUAL_NOTE";
    public static final String COLUMN_BRIEF_DESCRIPTION = "COLUMN_BRIEF_DESCRIPTION";

    public static final String COLUMN_TELEPHONE = "COLUMN_TELEPHONE";
    public static final String COLUMN_CELLPHONE = "COLUMN_CELLPHONE";
    public static final String COLUMN_FASCIMILE = "COLUMN_FASCIMILE";
    public static final String COLUMN_EMAIL = "COLUMN_EMAIL";
    public static final String COLUMN_WEBSITE = "COLUMN_WEBSITE";

    public static final String COLUMN_STREET = "COLUMN_STREET";
    public static final String COLUMN_PO_BOX = "COLUMN_PO_BOX";
    public static final String COLUMN_POSTAL_CODE = "COLUMN_POSTAL_CODE";
    public static final String COLUMN_CITY = "COLUMN_CITY";
    public static final String COLUMN_DISTRICT = "COLUMN_DISTRICT";
    public static final String COLUMN_COUNTRY = "COLUMN_COUNTRY";

    public static final String COLUMN_LEGAL_FORM = "COLUMN_LEGAL_FORM";
    public static final String COLUMN_TYPE_OF_ORGANISATION = "COLUMN_TYPE_OF_ORGANISATION";
    public static final String COLUMN_TYPE_OF_ACTIVITIES = "COLUMN_TYPE_OF_ACTIVITIES";
    public static final String COLUMN_ABOUT_US = "COLUMN_ABOUT_US";
    public static final String COLUMN_VISION = "COLUMN_VISION";
    public static final String COLUMN_MISSION_STATEMENT = "COLUMN_MISSION_STATEMENT";
    public static final String COLUMN_GUIDING_PRINCIPALS = "COLUMN_GUIDING_PRINCIPALS";

    public static final String COLUMN_OFFER = "COLUMN_OFFER";
    public static final String COLUMN_ROW_ID = "COLUMN_ROW_ID";
    public static final String COLUMN_NEED = "COLUMN_NEED";

    public static final String COLUMN_TYPE = "COLUMN_TYPE";

    public static final String COLUMN_FIRST_NAME = "COLUMN_FIRST_NAME";
    public static final String COLUMN_LAST_NAME = "COLUMN_LAST_NAME";
    public static final String COLUMN_PREFIX = "COLUMN_PREFIX";
    public static final String COLUMN_POSITION_IN_COMPANY = "COLUMN_POSITION_IN_COMPANY";
    public static final String COLUMN_NATIONALITY = "COLUMN_NATIONALITY";
    public static final String COLUMN_BIRTHDAY = "COLUMN_BIRTHDAY";
    public static final String COLUMN_PHOTO = "COLUMN_PHOTO";
    public static final String COLUMN_VIDEO = "COLUMN_VIDEO";
    public static final String COLUMN_PHOTO_NOTE = "COLUMN_PHOTO_NOTE";
    public static final String COLUMN_VIDEO_NOTE = "COLUMN_VIDEO_NOTE";


    public static final String COLUMN_NAME_OF_INSTITUTION = "COLUMN_NAME_OF_INSTITUTION";
    public static final String COLUMN_SUBJECT_FOCUS = "COLUMN_SUBJECT_FOCUS";
    public static final String COLUMN_DATE = "COLUMN_DATE";

    public static final String COLUMN_JOB_TITLE = "COLUMN_JOB_TITLE";
    public static final String COLUMN_NAME_OF_EMPLOYER = "COLUMN_NAME_OF_EMPLOYER";
    public static final String COLUMN_JOB_DESCRIPTION = "COLUMN_JOB_DESCRIPTION";

    public static final String COLUMN_NAME_OF_ASSOCIATION = "COLUMN_NAME_OF_ASSOCIATION";
    public static final String COLUMN_SECTOR = "COLUMN_SECTOR";

    public static final String COLUMN_INSTITUTION_NAME = "COLUMN_INSTITUTION_NAME";
    public static final String COLUMN_ORGANISATION_TYPE = "COLUMN_ORGANISATION_TYPE";

    public static final String COLUMN_SUBSIDIARY_NAME = "COLUMN_SUBSIDIARY_NAME";

    public static final String COLUMN_SERVICE = "COLUMN_SERVICE";
    public static final String COLUMN_PRODUCTS = "COLUMN_PRODUCTS";


    public static final String COLUMN_TITLE = "COLUMN_TITLE";
    public static final String COLUMN_DESCRIPTION = "COLUMN_DESCRIPTION";
    public static final String COLUMN_MEDIA = "COLUMN_MEDIA";


    public static final String COLUMN_COMPANY_SIZE = "COLUMN_COMPANY_SIZE";
    public static final String COLUMN_FOUNDING_YEAR_OF_COMPANY = "COLUMN_FOUNDING_YEAR_OF_COMPANY";
    public static final String COLUMN_AGE_OF_ACTIVE_BUSINESS = "COLUMN_AGE_OF_ACTIVE_BUSINESS";
    public static final String COLUMN_ANNUAL_SALES = "COLUMN_ANNUAL_SALES";
    public static final String COLUMN_ANNUAL_REVENUE = "COLUMN_ANNUAL_REVENUE";
    public static final String COLUMN_NO_OF_BRANCHES = "COLUMN_NO_OF_BRANCHES";
    public static final String COLUMN_TOTAL_NO_OF_EMPLOYEES = "COLUMN_TOTAL_NO_OF_EMPLOYEES";
    public static final String COLUMN_NO_OF_EMPLOYEES_IN_PRODUCTION = "COLUMN_NO_OF_EMPLOYEES_IN_PRODUCTION";
    public static final String COLUMN_NO_OF_ADMINISTRATIVE_STAFF = "COLUMN_NO_OF_ADMINISTRATIVE_STAFF";
    public static final String COLUMN_FREELANCE_ASSOCIATES = "COLUMN_FREELANCE_ASSOCIATES";
    public static final String COLUMN_INVESTMENT_VOLUME = "COLUMN_INVESTMENT_VOLUME";
    public static final String COLUMN_EMPLOYEE_ADDITIONAL_TRAINING = "COLUMN_EMPLOYEE_ADDITIONAL_TRAINING";
    public static final String COLUMN_LAST_EMPLOYEE_TRAINING = "COLUMN_LAST_EMPLOYEE_TRAINING";

    public static final String COLUMN_AWARD_NAME = "COLUMN_AWARD_NAME";
    public static final String COLUMN_AWARD_INSTITUTION = "COLUMN_AWARD_INSTITUTION";
    public static final String COLUMN_AWARD_DATE = "COLUMN_AWARD_DATE";
    public static final String COLUMN_AWARD_DESCRIPTION = "COLUMN_AWARD_DESCRIPTION";
    public static final String COLUMN_AWARD_TEL_FAX = "COLUMN_AWARD_TEL_FAX";
    public static final String COLUMN_AWARD_FILE = "COLUMN_AWARD_FILE";

    public static final String COLUMN_LANGUAGE = "COLUMN_LANGUAGE";
    public static final String COLUMN_INDUSTRY = "COLUMN_INDUSTRY";

    public static final String COLUMN_NAME_OF_COLLECTOR = "COLUMN_NAME_OF_COLLECTOR";
    public static final String COLUMN_AUTHORIZED_BY = "COLUMN_AUTHORIZED_BY";
    public static final String COLUMN_PLACE_OF_COLECTION = "COLUMN_PLACE_OF_COLECTION";
    public static final String COLUMN_OTHERS_SPECIFY = "COLUMN_OTHERS_SPECIFY";
    public static final String COLUMN_LOCATION = "COLUMN_LOCATION";
    public static final String COLUMN_ACCEPTANCE = "COLUMN_ACCEPTANCE";

    public Cursor cursor;


    private String CREATE_TABLE_COMPANY_PROFILE = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_PROFILE + " ( " +
            COLUMN_COMPANY_ID + " INTEGER PRIMARY KEY," +
            COLUMN_COMPANY_NAME + " VARCHAR," +
            COLUMN_REGISTERATION_NO + " VARCHAR," +
            COLUMN_LOGO + " NUMBER," +
            COLUMN_KEYVISUAL_PHOTO + " NUMBER," +
            COLUMN_LOGO_NOTE + " VARCHAR," +
            COLUMN_KEYVISUAL_NOTE + " VARCHAR," +
            COLUMN_BRIEF_DESCRIPTION + " VARCHAR " +
            ")";
    private String CREATE_TABLE_COMPANY_CONTACT = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_CONTACT + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_TELEPHONE + " VARCHAR," +
            COLUMN_CELLPHONE + " VARCHAR," +
            COLUMN_FASCIMILE + " VARCHAR," +
            COLUMN_EMAIL + " VARCHAR," +
            COLUMN_WEBSITE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_COMPANY_POSTAL_ADDRESS = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_POSTAL_ADDRESS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_STREET + " VARCHAR," +
            COLUMN_PO_BOX + " VARCHAR," +
            COLUMN_POSTAL_CODE + " VARCHAR," +
            COLUMN_CITY + " VARCHAR," +
            COLUMN_DISTRICT + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER " +
            ")";

    private String CREATE_TABLE_COMPANY_PHYSICAL_ADDRESS = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_PHYSICAL_ADDRESS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_STREET + " VARCHAR," +
            COLUMN_CITY + " VARCHAR," +
            COLUMN_POSTAL_CODE + " VARCHAR," +
            COLUMN_DISTRICT + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER " +
            ")";

    private String CREATE_TABLE_COMPANY_SPECIFIC_INFORMATION = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_SPECIFIC_INFORMATION + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_LEGAL_FORM + " VARCHAR," +
            COLUMN_TYPE_OF_ORGANISATION + " NUMBER," +
            COLUMN_TYPE_OF_ACTIVITIES + " NUMBER," +
            COLUMN_ABOUT_US + " VARCHAR," +
            COLUMN_VISION + " VARCHAR," +
            COLUMN_MISSION_STATEMENT + " VARCHAR," +
            COLUMN_GUIDING_PRINCIPALS + " VARCHAR " +
            ")";


    private String CREATE_TABLE_OFFERS = "CREATE TABLE IF NOT EXISTS " + TABLE_OFFERS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_OFFER + " VARCHAR" +
            ")";

    private String CREATE_TABLE_NEEDS = "CREATE TABLE IF NOT EXISTS " + TABLE_NEEDS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_NEED + " VARCHAR" +
            ")";

    private String CREATE_TABLE_OWNERS_MANAGERS_SPECIFIC_INFORMATION = "CREATE TABLE IF NOT EXISTS " + TABLE_OWNERS_MANAGERS_SUBSIDIARIES_REFERENCE + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_TYPE + " VARCHAR," +
            COLUMN_TELEPHONE + " VARCHAR," +
            COLUMN_CELLPHONE + " VARCHAR," +
            COLUMN_FASCIMILE + " VARCHAR," +
            COLUMN_EMAIL + " VARCHAR," +
            COLUMN_WEBSITE + " VARCHAR, " +
            COLUMN_FIRST_NAME + " VARCHAR," +
            COLUMN_LAST_NAME + " VARCHAR," +
            COLUMN_PREFIX + " NUMBER," +
            COLUMN_POSITION_IN_COMPANY + " NUMBER," +
            COLUMN_NATIONALITY + " VARCHAR," +
            COLUMN_BIRTHDAY + " VARCHAR," +
            COLUMN_PHOTO + " NUMBER," +
            COLUMN_VIDEO + " NUMBER, " +
            COLUMN_PHOTO_NOTE + " VARCHAR," +
            COLUMN_VIDEO_NOTE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_ACADEMIC_BACKGROUND = "CREATE TABLE IF NOT EXISTS " + TABLE_ACADEMIC_BACKGROUND + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_NAME_OF_INSTITUTION + " VARCHAR," +
            COLUMN_SUBJECT_FOCUS + " VARCHAR," +
            COLUMN_DATE + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER " +
            ")";

    private String CREATE_TABLE_PROFESSIONAL_BACKGROUND = "CREATE TABLE IF NOT EXISTS " + TABLE_PROFESSIONAL_BACKGROUND + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_JOB_TITLE + " VARCHAR," +
            COLUMN_NAME_OF_EMPLOYER + " VARCHAR," +
            COLUMN_JOB_DESCRIPTION + " VARCHAR," +
            COLUMN_DATE + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER " +
            ")";

    private String CREATE_TABLE_AFFILIATION = "CREATE TABLE IF NOT EXISTS " + TABLE_AFFILIATION + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_NAME_OF_ASSOCIATION + " VARCHAR," +
            COLUMN_SECTOR + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER " +
            ")";

    private String CREATE_TABLE_REFERENCE_SPECIFIC_INFORMATION = "CREATE TABLE IF NOT EXISTS " + TABLE_REFERENCE_SPECIFIC_INFORMATION + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_INSTITUTION_NAME + " VARCHAR," +
            COLUMN_ORGANISATION_TYPE + " VARCHAR," +
            COLUMN_LOGO + " NUMBER," +
            COLUMN_LOGO_NOTE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_SUBSIDIARY_SPECIFIC_INFORMATION = "CREATE TABLE IF NOT EXISTS " + TABLE_SUBSIDIARY_SPECIFIC_INFORMATION + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_SUBSIDIARY_NAME + " VARCHAR," +
            COLUMN_STREET + " VARCHAR," +
            COLUMN_POSTAL_CODE + " VARCHAR," +
            COLUMN_PO_BOX + " VARCHAR," +
            COLUMN_CITY + " VARCHAR," +
            COLUMN_DISTRICT + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER," +
            COLUMN_LOGO + " NUMBER," +
            COLUMN_LOGO_NOTE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_SERVICES = "CREATE TABLE IF NOT EXISTS " + TABLE_SERVICES + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_SERVICE + " VARCHAR" +
            ")";

    private String CREATE_TABLE_PRODUCTS = "CREATE TABLE IF NOT EXISTS " + TABLE_PRODUCTS_AND_PRODUCT_DETAILS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_PRODUCTS + " VARCHAR, " +
            COLUMN_TITLE + " VARCHAR," +
            COLUMN_DESCRIPTION + " VARCHAR," +
            COLUMN_MEDIA + " VARCHAR" +
            ")";

    //private String CREATE_TABLE_PRODUCT_DETAILS = "CREATE TABLE IF NOT EXISTS " + TABLE_PRODUCT_DETAILS + " ( " +
    //      COLUMN_COMPANY_ID + " NUMBER," +
    //    COLUMN_ROW_ID + " INTEGER," +
    //COLUMN_TITLE + " VARCHAR," +
    //COLUMN_DESCRIPTION + " VARCHAR," +
    //COLUMN_MEDIA + " VARCHAR" +
    //  ")";

    private String CREATE_TABLE_COMPANY_INDICATORS = "CREATE TABLE IF NOT EXISTS " + TABLE_COMPANY_INDICATORS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_COMPANY_SIZE + " NUMBER," +
            COLUMN_FOUNDING_YEAR_OF_COMPANY + " VARCHAR," +
            COLUMN_AGE_OF_ACTIVE_BUSINESS + " VARCHAR," +
            COLUMN_ANNUAL_SALES + " VARCHAR," +
            COLUMN_ANNUAL_REVENUE + " VARCHAR," +
            COLUMN_NO_OF_BRANCHES + " VARCHAR," +
            COLUMN_TOTAL_NO_OF_EMPLOYEES + " VARCHAR," +
            COLUMN_NO_OF_EMPLOYEES_IN_PRODUCTION + " VARCHAR," +
            COLUMN_NO_OF_ADMINISTRATIVE_STAFF + " VARCHAR," +
            COLUMN_FREELANCE_ASSOCIATES + " VARCHAR," +
            COLUMN_INVESTMENT_VOLUME + " NUMBER," +
            COLUMN_EMPLOYEE_ADDITIONAL_TRAINING + " NUMBER," +
            COLUMN_LAST_EMPLOYEE_TRAINING + " VARCHAR" +
            ")";

    private String CREATE_TABLE_AWARDS = "CREATE TABLE IF NOT EXISTS " + TABLE_AWARDS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_AWARD_NAME + " VARCHAR," +
            COLUMN_AWARD_INSTITUTION + " VARCHAR," +
            COLUMN_AWARD_DATE + " VARCHAR," +
            COLUMN_AWARD_DESCRIPTION + " VARCHAR," +
            COLUMN_AWARD_TEL_FAX + " VARCHAR," +
            COLUMN_AWARD_FILE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_LATEST_NEWS = "CREATE TABLE IF NOT EXISTS " + TABLE_LATEST_NEWS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " INTEGER," +
            COLUMN_DATE + " VARCHAR," +
            COLUMN_TITLE + " VARCHAR," +
            COLUMN_DESCRIPTION + " VARCHAR " +
            ")";

    private String CREATE_TABLE_BUSINESS_CORRESPONDING_LANGUAGES = "CREATE TABLE IF NOT EXISTS " + TABLE_BUSINESS_CORRESPONDING_LANGUAGES + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_LANGUAGE + " VARCHAR " +
            ")";

    private String CREATE_TABLE_SECTORS = "CREATE TABLE IF NOT EXISTS " + TABLE_SECTORS + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_ROW_ID + " NUMBER," +
            COLUMN_INDUSTRY + " NUMBER, " +
            COLUMN_SECTOR + " VARCHAR" +
            ")";

    private String CREATE_TABLE_SOURCE_OF_DATA = "CREATE TABLE IF NOT EXISTS " + TABLE_SOURCE_OF_DATA + " ( " +
            COLUMN_COMPANY_ID + " NUMBER," +
            COLUMN_NAME_OF_COLLECTOR + " VARCHAR," +
            COLUMN_AUTHORIZED_BY + " VARCHAR," +
            COLUMN_PLACE_OF_COLECTION + " VARCHAR," +
            COLUMN_OTHERS_SPECIFY + " VARCHAR," +
            COLUMN_DATE + " VARCHAR," +
            COLUMN_LOCATION + " VARCHAR," +
            COLUMN_COUNTRY + " NUMBER," +
            COLUMN_ACCEPTANCE + " VARCHAR " +
            ")";


    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here
        db.execSQL(CREATE_TABLE_COMPANY_PROFILE);
        db.execSQL(CREATE_TABLE_COMPANY_CONTACT);
        db.execSQL(CREATE_TABLE_COMPANY_POSTAL_ADDRESS);
        db.execSQL(CREATE_TABLE_COMPANY_PHYSICAL_ADDRESS);
        db.execSQL(CREATE_TABLE_COMPANY_SPECIFIC_INFORMATION);
        db.execSQL(CREATE_TABLE_OFFERS);
        db.execSQL(CREATE_TABLE_NEEDS);
        db.execSQL(CREATE_TABLE_OWNERS_MANAGERS_SPECIFIC_INFORMATION);
        db.execSQL(CREATE_TABLE_ACADEMIC_BACKGROUND);
        db.execSQL(CREATE_TABLE_PROFESSIONAL_BACKGROUND);
        db.execSQL(CREATE_TABLE_AFFILIATION);
        db.execSQL(CREATE_TABLE_REFERENCE_SPECIFIC_INFORMATION);
        db.execSQL(CREATE_TABLE_SUBSIDIARY_SPECIFIC_INFORMATION);
        db.execSQL(CREATE_TABLE_SERVICES);
        db.execSQL(CREATE_TABLE_PRODUCTS);
        //db.execSQL(CREATE_TABLE_PRODUCT_DETAILS);
        db.execSQL(CREATE_TABLE_COMPANY_INDICATORS);
        db.execSQL(CREATE_TABLE_AWARDS);
        db.execSQL(CREATE_TABLE_LATEST_NEWS);
        db.execSQL(CREATE_TABLE_BUSINESS_CORRESPONDING_LANGUAGES);
        db.execSQL(CREATE_TABLE_SECTORS);
        db.execSQL(CREATE_TABLE_SOURCE_OF_DATA);

        Log.v(TAG, "TABLE CREATED");
    }

    private void deleteAllRecords(SQLiteDatabase db) {
        String tableName;
        tableName = TABLE_COMPANY_PROFILE;
        db.delete(tableName, null, null);
        tableName = TABLE_COMPANY_CONTACT;
        db.delete(tableName, null, null);
        tableName = TABLE_COMPANY_POSTAL_ADDRESS;
        db.delete(tableName, null, null);
        tableName = TABLE_COMPANY_PHYSICAL_ADDRESS;
        db.delete(tableName, null, null);
        tableName = TABLE_COMPANY_SPECIFIC_INFORMATION;
        db.delete(tableName, null, null);
        tableName = TABLE_OFFERS;
        db.delete(tableName, null, null);
        tableName = TABLE_NEEDS;
        db.delete(tableName, null, null);
        tableName = TABLE_OWNERS_MANAGERS_SUBSIDIARIES_REFERENCE;
        db.delete(tableName, null, null);
        tableName = TABLE_ACADEMIC_BACKGROUND;
        db.delete(tableName, null, null);
        tableName = TABLE_PROFESSIONAL_BACKGROUND;
        db.delete(tableName, null, null);
        tableName = TABLE_AFFILIATION;
        db.delete(tableName, null, null);
        tableName = TABLE_REFERENCE_SPECIFIC_INFORMATION;
        db.delete(tableName, null, null);
        tableName = TABLE_SUBSIDIARY_SPECIFIC_INFORMATION;
        db.delete(tableName, null, null);
        tableName = TABLE_SERVICES;
        db.delete(tableName, null, null);
        tableName = TABLE_PRODUCTS_AND_PRODUCT_DETAILS;
        db.delete(tableName, null, null);
        tableName = TABLE_PRODUCT_DETAILS;
        db.delete(tableName, null, null);
        tableName = TABLE_COMPANY_INDICATORS;
        db.delete(tableName, null, null);
        tableName = TABLE_AWARDS;
        db.delete(tableName, null, null);
        tableName = TABLE_LATEST_NEWS;
        db.delete(tableName, null, null);
        tableName = TABLE_BUSINESS_CORRESPONDING_LANGUAGES;
        db.delete(tableName, null, null);
        tableName = TABLE_SECTORS;
        db.delete(tableName, null, null);
        tableName = TABLE_SOURCE_OF_DATA;
        db.delete(tableName, null, null);
    }

    public void addBusiness(String businessName) {
        SQLiteDatabase db = this.getWritableDatabase();
        Log.v(TAG, "Adding New Business : " + businessName);

        ContentValues values = new ContentValues();
        values.put(COLUMN_COMPANY_NAME, businessName);
        long result = db.insert(TABLE_COMPANY_PROFILE, null, values);
        Log.v(TAG, "Insert = " + result);

        addValue(result, TABLE_COMPANY_CONTACT);
        addValue(result, TABLE_COMPANY_POSTAL_ADDRESS);
        addValue(result, TABLE_COMPANY_PHYSICAL_ADDRESS);
        addValue(result, TABLE_COMPANY_SPECIFIC_INFORMATION);
        //addValue(result, TABLE_OFFERS);
        //addValue(result, TABLE_NEEDS);
        addValue(result, TABLE_OWNERS_MANAGERS_SUBSIDIARIES_REFERENCE);
        //addValue(result, TABLE_ACADEMIC_BACKGROUND);
        //addValue(result, TABLE_PROFESSIONAL_BACKGROUND);
        //addValue(result, TABLE_AFFILIATION);
        addValue(result, TABLE_REFERENCE_SPECIFIC_INFORMATION);
        addValue(result, TABLE_SUBSIDIARY_SPECIFIC_INFORMATION);
        //addValue(result, TABLE_SERVICES);
        //addValue(result, TABLE_PRODUCTS_AND_PRODUCT_DETAILS);
        addValue(result, TABLE_COMPANY_INDICATORS);
        //addValue(result, TABLE_AWARDS);
        //addValue(result, TABLE_LATEST_NEWS);
        addValue(result, TABLE_BUSINESS_CORRESPONDING_LANGUAGES);
        //addValue(result, TABLE_SECTORS);
        addValue(result, TABLE_SOURCE_OF_DATA);
        setCurrentCompanyId(result);
        if (db != null) db.close();
    }

    public boolean deleteBusiness(int id)
    {
        try {
            Log.v(TAG, "Deleting Businees id = " + id);
            SQLiteDatabase db = this.getWritableDatabase();

            db.delete(TABLE_COMPANY_CONTACT, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_COMPANY_POSTAL_ADDRESS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_COMPANY_PHYSICAL_ADDRESS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_COMPANY_SPECIFIC_INFORMATION, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_OFFERS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_NEEDS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_OWNERS_MANAGERS_SUBSIDIARIES_REFERENCE, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_ACADEMIC_BACKGROUND, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_PROFESSIONAL_BACKGROUND, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_AFFILIATION, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_REFERENCE_SPECIFIC_INFORMATION, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_SUBSIDIARY_SPECIFIC_INFORMATION, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_SERVICES, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_PRODUCTS_AND_PRODUCT_DETAILS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            //db.delete(TABLE_PRODUCT_DETAILS,COLUMN_COMPANY_ID + " = ?",new String[]{id+""});
            db.delete(TABLE_COMPANY_INDICATORS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_AWARDS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_LATEST_NEWS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_BUSINESS_CORRESPONDING_LANGUAGES, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_SECTORS, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_SOURCE_OF_DATA, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            db.delete(TABLE_COMPANY_PROFILE, COLUMN_COMPANY_ID + " = ?", new String[]{id + ""});
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }



    private void addValue(long id, String tableName) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_COMPANY_ID, id);
        db.insert(tableName, null, values);
        db.close();
    }

    public PreviousBusiness[] getPreviousBusinessList() {
        SQLiteDatabase db = this.getReadableDatabase();
        PreviousBusiness[] result = null;
        try {
            String query = "SELECT " + COLUMN_COMPANY_ID + "," + COLUMN_COMPANY_NAME + "  FROM " + TABLE_COMPANY_PROFILE;
            //Log.v(TAG, "Query = " + query);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() != 0) {
                result = new PreviousBusiness[cursor.getCount()];
                for (int i = 0; i < result.length; i++) {
                    result[i] = new PreviousBusiness();
                    result[i].setBusinessID(cursor.getInt(0));
                    result[i].setBusinessName(cursor.getString(1));
                    cursor.moveToNext();
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;


    }

    public String getStringValue(String columnName, String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        String result = null;
        try {
            String query = "SELECT " + columnName + "  FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId();
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() != 0) {
                result = cursor.getString(0);
                Log.v(TAG, "Query = " + query +
                        "\nResult =  " + result);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;
    }

    public int getIntValue(String columnName, String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        int result = -1;
        try {
            String query = "SELECT " + columnName + "  FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId();
            Log.v(TAG, "Query = " + query +
                    "\nResult =  " + result);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() != 0) {
                result = cursor.getInt(0);
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;
    }

    public void insertRow(String tableName, int rowNo) {


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_COMPANY_ID, getCurrentCompanyId());
        values.put(COLUMN_ROW_ID, rowNo);
        db.insert(tableName, null, values);
        db.close();
    }

    public void updateRowWithString(String TableName, int rowNo, String ColumnName, String value) {
        Log.v(TAG, "Updating table = " + TableName +
                "\nColumn = " + ColumnName +
                "\nRow = " + rowNo +
                "\nValues = " + value);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ColumnName, value);
        long result = db.update(TableName, values, COLUMN_COMPANY_ID + " = ? AND " + COLUMN_ROW_ID + " = ?", new String[]{getCurrentCompanyId() + "", rowNo + ""});
        Log.v(TAG, "Result  = " + result);
        if (db != null) db.close();
    }


    public void updateRowWithInt(String TableName, int rowNo, String ColumnName, int value) {
        SQLiteDatabase db = this.getWritableDatabase();
        Log.v(TAG, "Updating Table = " + TableName);
        long result = -1;

        ContentValues values = new ContentValues();
        values.put(ColumnName, value);
        result = db.update(TableName, values, COLUMN_COMPANY_ID + " = " + getCurrentCompanyId() + " AND " + COLUMN_ROW_ID + " = " + rowNo, null);
        Log.v(TAG, TableName + "." + ColumnName + " updated with value = " + value);
        if (db != null) db.close();
    }

    public int[] getrowids(String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        int[] result = null;
        try {
            String query = "SELECT " + COLUMN_ROW_ID + " FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId();
            //Log.v(TAG, "Query = " + query);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() > 0 ) {
                result = new int[cursor.getCount()];
                for (int i = 0; i < result.length; i++) {
                    Log.v(TAG, "Row id = " + cursor.getInt(0));
                    result[i] = cursor.getInt(0);
                    cursor.moveToNext();
                }
            } else {
                Log.v(TAG, "IDS are null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;
    }

    public String getStringFromRow(String tableName, String columnName, int rowid) {
        SQLiteDatabase db = this.getReadableDatabase();
        String result = null;
        try {
            String query = "SELECT " + columnName + " FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId() + " AND " + COLUMN_ROW_ID + " = " + rowid;
            Log.v(TAG, "Query = " + query);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() != 0) {
                result = cursor.getString(0);

            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;
    }

    public void getTableData(String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            String query = "SELECT * FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId();
            Log.v(TAG, "Query = " + query);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() > 0) {
                for (int i = 0; i < cursor.getCount(); i++) {
                    Log.v(TAG, "\n" + cursor.getColumnName(0) + " = " + cursor.getInt(0) +
                            "\n" + cursor.getColumnName(1) + " = " + cursor.getInt(1) +
                            "\n" + cursor.getColumnName(2) + " = " + cursor.getInt(2) +
                            "\n" + cursor.getColumnName(3) + " = " + cursor.getString(3));
                    cursor.moveToNext();
                }
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
    }

    public int getIntFromRow(String tableName, String columnName, int rowid) {
        SQLiteDatabase db = this.getReadableDatabase();
        int result = -1;
        try {
            String query = "SELECT " + columnName + " FROM " + tableName + " WHERE " + COLUMN_COMPANY_ID + " = " + getCurrentCompanyId() + " AND " + COLUMN_ROW_ID + " = " + rowid;
            Log.v(TAG, "Query = " + query);
            cursor = db.rawQuery(query, null);
            cursor.moveToFirst();
            if (cursor.getCount() != 0) {
                result = cursor.getInt(0);

            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
            if (db != null) db.close();
        }
        return result;
    }

    public void updateStringValue(String TableName, String ColumnName, String value) {

        SQLiteDatabase db = this.getWritableDatabase();
        Log.v(TAG, "Updating Table = " + TableName);
        long result = -1;

        ContentValues values = new ContentValues();
        values.put(ColumnName, value);
        result = db.update(TableName, values, COLUMN_COMPANY_ID + " = " + getCurrentCompanyId(), null);
        Log.v(TAG, TableName + "." + ColumnName + " updated with value = " + value);
        if (db != null) db.close();
    }

    public void updateIntValue(String TableName, String ColumnName, int value) {
        SQLiteDatabase db = this.getWritableDatabase();
        Log.v(TAG, "Updating Table = " + TableName);
        long result = -1;

        ContentValues values = new ContentValues();
        values.put(ColumnName, value);
        result = db.update(TableName, values, COLUMN_COMPANY_ID + " = " + getCurrentCompanyId(), null);
        Log.v(TAG, "Row Updated");
        if (db != null) db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCT_DETAILS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTS_AND_PRODUCT_DETAILS);

        db.execSQL(CREATE_TABLE_PRODUCTS);
        // Create tables again
        onCreate(db);

    }
}


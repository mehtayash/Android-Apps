package com.example.triviality;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; //correct option
	private static final String KEY_OPTA= "opta"; //option a
	private static final String KEY_OPTB= "optb"; //option b
	private static final String KEY_OPTC= "optc"; //option c
	private static final String KEY_OPTD= "optd"; //option d
	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT, "+KEY_OPTD+" TEXT )";
		db.execSQL(sql);
		addQuestions();
		//db.close();
	}
	private void addQuestions()
	{
		Question q1=new Question("What is Brand Name for Lubricants marketed by Bharat Petroleum Corporation Ltd.?",
				"Servo", "MAK", "Castrol", "None of these","MAK");
		this.addQuestion(q1);
		Question q2=new Question("What is the official website for MAK® Lubricants?", "www.maklubes.com",
				"www.castrol.com", "www.total.com",
				"None of the above","www.maklubes.com");
		this.addQuestion(q2);
		Question q3=new Question("WWho is the manufacturer of MAKBase the superior quality Group II+  base oils in India?",
				"Bharat Petroleum", "Indian Oil","Hindustan Petroleum","Castrol","Bharat Petroleum");
		this.addQuestion(q3);
		Question q4=new Question("What is the major advantage of using an emulsion type cutting oil versus a  neat oil ?",
				"Better lubricity", "Better cooling", "Better surface finish",
				"Less corrosion","Better cooling");
		this.addQuestion(q4);
		Question q5=new Question("In order to form a stable emulsion of oil and water, which should be added to which?",
				"Put water in oil and stir vigorously","Put oil in water and stir vigorously","Put water and oil together while stirring vigorously","Either water in oil or oil in water, it mixes automatically","Put oil in water and stir vigorously");
		this.addQuestion(q5);
		Question q6=new Question("Which of the following is high performance gear oil of MAK Lubricants?",
				"MAK Metamol","MAK Amocam Plus","MAK Sherol BN","MAK Form SM","MAK Amocam Plus");
		this.addQuestion(q6);
		Question q7=new Question("Which of these is not an element of hydraulic system?",
				"Pumps","Valves","Seals","Compressors","Compressors");
		this.addQuestion(q7);
		Question q8=new Question("Best way to avoid smell in emulsion type cutting fluid sump is",
				"Chill the emulsion","Top up with more oil","Heat the emulsion","Aerate the emulsion by stirring","Aerate the emulsion by stirring");
		this.addQuestion(q8);
		Question q9=new Question("Which oil is most suitble for hardness above 500 ppm?",
				"MAK Sherol B","MAK Sherol EP SS","MAK Sherol BN","None of the above","MAK Sherol EP SS");
		this.addQuestion(q9);
		Question q10=new Question("How is HLP type hydraulic oil better than HL type hydraulic oil?",
				"Energy Saving","Cleanliness","Load bearing","Better cooling","Load bearing");
		this.addQuestion(q10);
		Question q11=new Question("Detergents and Dispersants are added in which type of Lubricants?","Engine Oils", "Greases", "Turbine Oils", "Cutting Oils","Engine Oils");
		this.addQuestion(q11);
		Question q12=new Question("Upon Use  Engine Oils Should", "Turn Black To Some Extent",
				"Not Turn Black At All", "Turn Red",
				"Turn Transparent","Turn Black To Some Extent");
		this.addQuestion(q12);
		Question q13=new Question("Higher gas solubility in a hydraulic oil may leads to",
				"Cavitation", "Spongy action during operation","Erosion damage","All of the above","All of the above");
		this.addQuestion(q13);
		Question q14=new Question("pH of cutting fluid should be",
				"6 to 7", "exactly 7", "8 to 9",
				"11 to 12","8 to 9");
		this.addQuestion(q14);
		Question q15=new Question("Which of the following is oil for alluminium wire drawing by MAK Lubricants?",
				"MAK Form AL","MAK Amocam","MAK Form CB","MAK Triponol H","MAK Form AL");
		this.addQuestion(q15);
		Question q16=new Question("Strength of the emulsion can be increased by ",
				"Topping up with fresh oil in sump directly","Topping up with stonger emulsion prepared seperately","Stirring the sump vigourously","Removing tramp oil","Topping up with stonger emulsion prepared seperately");
		this.addQuestion(q16);

		Question q17=new Question("Refroctometer is used to ",
				"Check pH of emulsion","Check strength of emulsion","Check remaining life of emulsion","Check microbial development","Check strength of emulsion");
		this.addQuestion(q17);
		Question q18=new Question("Cutting fluid recommended for Aluminium machining is",
				"MAK Sherol BN","MAK Sherol B","MAK Sherol EP SS","MAK Sherol E","MAK Sherol EP SS");
		this.addQuestion(q18);
		Question q19=new Question("A Lubricant Container Has API SJ Written On It , Then It Has",
				"Diesel Engine Oil","Petrol Engine Oil","Gear Oil","Industrial Oil","Petrol Engine Oil");
		this.addQuestion(q19);
		Question q20=new Question("Proactive maintenance involves",
				"Changing oil every year","Checking for contamination every day","Changing oil when oil solidifies","Changing oil filters every year","Checking for contamination every day");
		this.addQuestion(q20);
		Question q21=new Question("Skimmers are used to",
				"Remove wear particles from the emulsion","Remove froth from the sump","Removing tramp oil","Agitation of emulsion","Removing tramp oil");
		this.addQuestion(q21);
		Question q22=new Question("Group II base oils are better than Group I oils in",
				"Water removal","Oxidation stability","Colour","All of the above","All of the above");
		this.addQuestion(q22);
		Question q23=new Question("The most severe machining operation is",
				"Deep hole drilling","Vertical Milling","Grinding","Broaching","Broaching");
		this.addQuestion(q23);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION());
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		values.put(KEY_OPTD, quest.getOPTD());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quest.setOPTD(cursor.getString(6));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}

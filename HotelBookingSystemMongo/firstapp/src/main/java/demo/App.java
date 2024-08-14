import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//CRUD operation in Mango Database with java
//create MangoDb driver in java using maven
//create database from client
//create collection from database
//create document and add in collection
//update collecetion from databse
//create document and add in collection
//update document from collection
//delete document from databse
//access document from collection
//drop collection
//Database Name : HotelDB , collection Name:BookingCollection.
//Document key name: bookingID,userName,userEmail,userMobile,checkInDate,checkOutDate,
//noOfAdults,noOfChildren,noOfRooms,price,roomType,hotelName,meal,bookingStatus,
//payment status,paymentType,paymentID
public class Main {
    public static void main(String[] args) {
        //to create a client for mongodatabase connecction
        var client = MongoClients.create("mongodb://localhost:27017/");

        // to create or access the database from client
        var hotelDB = client.getDatabase("hotelDB");

        //to create the collection in hoteldb database
        //to check the collection is exist or not
        var bookingCollection = hotelDB.getCollection("bookingCollection");
        if(bookingCollection.toString() == "bookingCollection"){
            System.out.println("Collection already exits");
        }else{
            hotelDB.createCollection("bookingCollection");
        }
        //for creating rondom bookingID
        var random = new Random();

        //create document for hotel booking in collection
        var bookingDocument = new Document();



        //add data into document in key value pair
//bookingDocument.append("userName","Sakshi Dubey");
        //bookingDocument.append("UserEmail","sakshidubey015@gmail.com");
        //bookingDocument.append("UserMobile","8953438857");
        //bookingDocument.append("HotelName","Goel Hostel");
        //bookingDocument.append("checkInDate","28/08/2024");
        //bookingDocument.append("checkOutDate","29/08/2024");
        //bookingDocument.append("meal","false");
        //bookingDocument.append("roomType","delux");
        //bookingDocument.append("noOfRoom",2);
        //bookingDocument.append("noOfAdults",2);
        //bookingDocument.append("noOfChildren",0);
        //bookingDocument.append("gst",18);
        //bookingDocument.append("price",2500);
        //bookingDocument.append("bookingStatus",true);
        //bookingDocument.append("paymentType",random.nextInt(99999));
        //bookingDocument.append("paymentStatus",false);
        //bookingDocument.append("paymentID",random.nextInt(9999999));
        //bookingDocument.append("discount",20);

        //to add the document in collection
       // bookingCollection.insertOne(bookingDocument);

        //to insert the booking for multiple user
//        ArrayList<Document> bookingList = new ArrayList<>();
//
//        //create document for hotel booking in collection
//        var bookingDocument1= new Document();
//
//        //add data into document in key value pair
//        bookingDocument1.append("userName","Sakshi Dubey");
//        bookingDocument1.append("UserEmail","sakshidubey015@gmail.com");
//        bookingDocument1.append("UserMobile","8953438857");
//        bookingDocument1.append("HotelName","Goel Hostel");
//        bookingDocument1.append("checkInDate","28/08/2024");
//        bookingDocument1.append("checkOutDate","29/08/2024");
//        bookingDocument1.append("meal","false");
//        bookingDocument1.append("roomType","delux");
//        bookingDocument1.append("noOfRoom",2);
//        bookingDocument1.append("noOfAdults",2);
//        bookingDocument1.append("noOfChildren",0);
//        bookingDocument1.append("gst",18);
//        bookingDocument1.append("price",2500);
//        bookingDocument1.append("bookingStatus",true);
//        bookingDocument1.append("paymentType",random.nextInt(99999));
//        bookingDocument1.append("paymentStatus",false);
//        bookingDocument1.append("paymentID",random.nextInt(9999999));
//        bookingDocument1.append("discount",20);
//        bookingList.add(bookingDocument1);
//
//        var bookingDocument2= new Document();
//
//        //add data into document in key value pair
//        bookingDocument2.append("userName","Harshika Sharma");
//        bookingDocument2.append("UserEmail","harshika015@gmail.com");
//        bookingDocument2.append("UserMobile","9534388570");
//        bookingDocument2.append("HotelName","Goel Hostel");
//        bookingDocument2.append("checkInDate","28/08/2024");
//        bookingDocument2.append("checkOutDate","29/08/2024");
//        bookingDocument2.append("meal","false");
//        bookingDocument2.append("roomType","delux");
//        bookingDocument2.append("noOfRoom",2);
//        bookingDocument2.append("noOfAdults",2);
//        bookingDocument2.append("noOfChildren",0);
//        bookingDocument2.append("gst",18);
//        bookingDocument2.append("price",2500);
//        bookingDocument2.append("bookingStatus",true);
//        bookingDocument2.append("paymentType",random.nextInt(99999));
//        bookingDocument2.append("paymentStatus",false);
//        bookingDocument2.append("paymentID",random.nextInt(9999999));
//        bookingDocument2.append("discount",20);
//        bookingList.add(bookingDocument2);
//
//        var bookingDocument3= new Document();
//
//        //add data into document in key value pair
//        bookingDocument3.append("userName","Rohit Sharma");
//        bookingDocument3.append("UserEmail","rohitsharma015@gmail.com");
//        bookingDocument3.append("UserMobile","8959438857");
//        bookingDocument3.append("HotelName","Goel Hostel");
//        bookingDocument3.append("checkInDate","28/08/2024");
//        bookingDocument3.append("checkOutDate","29/08/2024");
//        bookingDocument3.append("meal","false");
//        bookingDocument3.append("roomType","delux");
//        bookingDocument3.append("noOfRoom",2);
//        bookingDocument3.append("noOfAdults",2);
//        bookingDocument3.append("noOfChildren",0);
//        bookingDocument3.append("gst",18);
//        bookingDocument3.append("price",2500);
//        bookingDocument3.append("bookingStatus",true);
//        bookingDocument3.append("paymentType",random.nextInt(99999));
//        bookingDocument3.append("paymentStatus",false);
//        bookingDocument3.append("paymentID",random.nextInt(9999999));
//        bookingDocument3.append("discount",20);
//        bookingList.add(bookingDocument3);
//
//        bookingCollection.insertMany(bookingList);

        //update the document from collection
        //bookingCollection.updateOne(new Document("userName","Sakshi Dubey"),new Document("$set",new Document().append("meal",false).append("noOfAdults",4).append("price",8000)));

        //update many document from document
        var updateDocument = new Document();
        updateDocument.append("paymentStatus",true);
        updateDocument.append("noOfAdults",5);
        updateDocument.append("roomType","Luxury");
        bookingCollection.updateMany(new Document("userName","Sakshi Dubey") ,new Document("$set",updateDocument));

        //delete one document from Collection
//        bookingCollection.deleteOne(new Document("userName","Sakshi Dubey"));
//
//        //delete many docuent from collection
//        bookingCollection.deleteMany(new Document("userName","Sakshi Dubey"));

        //fetch the data from collection
        //retrieving the documents
//        BasicDBObject whereQuery = new BasicDBObject();
//        whereQuery.put("bookingID",288677);
//        FindIterable<Document> cursor = bookingCollection.find(whereQuery);
//        String userName =
//        System.out.println(cursor.);

        FindIterable<Document> result = bookingCollection.find();
        System.out.println(result.iterator().next());

        for(Document document : result)
        {
            System.out.println(document);
            System.out.println(document.get("UserName"));
            System.out.println(document.get("UserEmail"));
            System.out.println(document.get("UserMobile"));
            System.out.println(document.get("HotelName"));
            System.out.println(document.get("checkInDate"));
            System.out.println(document.get("checkOutDate"));
            System.out.println(document.get("roomType"));

        }






    }
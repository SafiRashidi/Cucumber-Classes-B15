package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    // we will pass the body in multiple formats, for this we have created this class

    public static String createEmployeePayload() {
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"safi\",\n" +
                "  \"emp_lastname\": \"rashidi\",\n" +
                "  \"emp_middle_name\": \"sr\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1991-05-20\",\n" +
                "  \"emp_status\": \"Confirmed\",\n" +
                "  \"emp_job_title\": \"Engineer\"\n" +
                "}";

        return createEmployeePayload;
    }
    public static String createEmployeePayloadJson() {

        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "safi");
        obj.put("emp_lastname", "rashidi");
        obj.put("emp_middle_name", "sr");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "1991-05-20");
        obj.put("emp_status","confirmed");
        obj.put("emp_job_title","Engineer");
        return obj.toString();
    }
}

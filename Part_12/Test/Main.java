package Part_12.Test;

import java.time.Instant;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import com.leidos.leaf.dataobject.service.IDataObjectService;
import com.leidos.leaf.dataobject.service.rest.DataObjectServiceRestClient;
import com.leidos.leaf.resteasy.util.RestClientUtils;

public class Main {
    public static void main(String[] args) {

        // Testing retrieving times and outputting a status based on current time

        String startTime = "2023-07-24T18:30:00.000Z";
        String endTime = "2023-07-24T18:35:00.000Z";
        String taskID = "12345ABCDE";

        Instant startTimeConverted = Instant.parse(startTime);
        Instant endTimeConverted = Instant.parse(endTime);

        Task task = new Task(startTimeConverted, endTimeConverted, taskID);

        String currentStatus = task.setStatus();

        System.out.println(currentStatus);

        // Testing adding a data object to the LEAF test app

        
}
}

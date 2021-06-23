package me.mtaech.fries.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseUtil {

    public static void sendMsg(HttpServletResponse response, ApiResult apiResult)
            throws IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(apiResult);
        writer.println(res);
        writer.flush();
        writer.close();
    }
}

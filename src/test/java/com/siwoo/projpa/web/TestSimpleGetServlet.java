package com.siwoo.projpa.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.ServletException;
import java.io.IOException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestSimpleGetServlet {

    @Autowired ProjectController projectController;
    @Test
    public void doGet() throws ServletException, IOException {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/project");
        MockHttpServletResponse response = new MockHttpServletResponse();
    }
}

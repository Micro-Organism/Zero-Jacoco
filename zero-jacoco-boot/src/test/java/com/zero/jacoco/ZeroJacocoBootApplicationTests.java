package com.zero.jacoco;

import com.zero.jacoco.service.ShippingService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@WebMvcTest
@SpringBootTest
@AutoConfigureMockMvc
class ZeroJacocoBootApplicationTests {

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    public void before() {
        log.info("init some data");
    }

    @AfterEach
    public void after() {
        log.info("clean some data");
    }

    @Test
    public void execute() {
        log.info("your method test Code");
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("HelloWorld")));
    }

    @Test
    public void incorrectWeight() {
        ShippingService shippingService = new ShippingService();
        assertThrows(IllegalStateException.class, () -> shippingService.calculateShippingFee(-1));
    }

    @Test
    public void firstRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(5, shippingService.calculateShippingFee(1));
    }

    @Test
    public void secondRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(10, shippingService.calculateShippingFee(4));
    }

    @Test
    public void lastRangeWeight() {
        ShippingService shippingService = new ShippingService();
        assertEquals(15, shippingService.calculateShippingFee(10));
    }

}

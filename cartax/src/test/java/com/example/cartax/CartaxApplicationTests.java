package com.example.cartax;

import com.example.cartax.models.Car;
import com.example.cartax.models.Customer;
import com.example.cartax.models.Registration;
import com.example.cartax.models.Tax;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartaxApplicationTests
{
    @LocalServerPort
    private int serverPort;

    @Test
    void contextLoads() {
    }

    @Autowired
    private TestRestTemplate restTemplate;

    private String GetURL(String... params)
    {
        String url = "http://localhost:" + serverPort;

        for (String p : params)
        {
            url += "/" + p;
        }
        return url;
    }
    // Tests checking that you can't search database id's by strings
    @Test
    public void TestIncorrectTypeCustomerGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("customer", "hello"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestIncorrectTypeTaxGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("tax", "hello"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestIncorrectTypeCarGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("car", "hello"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestIncorrectTypeRegistrationGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("registration", "hello"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_BAD_REQUEST, response.getStatusLine().getStatusCode());
    }

    //Tests checking that you can check database id's with integers
    @Test
    public void TestCorrectTypeCustomerGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("customer", "1"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestCorrectTypeTaxGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("tax", "1"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestCorrectTypeCarGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("car", "1"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }
    @Test
    public void TestCorrectTypeRegistrationGet() throws IOException
    {
        HttpUriRequest request = new HttpGet(GetURL("registration", "1"));
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
    }

    //Tests sending data to the database and then checking that data exists
    @Test
    @Order(1)
    public void TestCustomerPostSuccessfulHttpCode() throws URISyntaxException
    {
        URI uri = new URI(GetURL("customer"));

        Customer customer = new Customer();
        customer.setFname("Joe");
        customer.setSname("Bloggs");
        customer.setAddress("123 Generic Lane");
        customer.setPostcode("AB12 3CD");

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Customer> request = new HttpEntity(customer, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(uri, request, String.class);

        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusCodeValue());
    }

    @Test
    @Order(2)
    public void TestCustomerGetSuccessfulData() throws URISyntaxException
    {
        URI uri = new URI(GetURL("customer", "1"));

        ResponseEntity<Customer> response = restTemplate.getForEntity(uri, Customer.class);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusCodeValue());
        Assert.assertEquals("Joe", response.getBody().getFname());
        Assert.assertEquals("Bloggs", response.getBody().getSname());
        Assert.assertEquals("123 Generic Lane", response.getBody().getAddress());
        Assert.assertEquals("AB12 3CD", response.getBody().getPostcode());
    }

    @Test
    @Order(3)
    public void TestTaxPostSuccessfulHttpCode() throws URISyntaxException
    {
        URI uri = new URI(GetURL("tax"));

        Tax tax = new Tax();
        tax.setType("Car");
        tax.setPrice(123.5);

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Customer> request = new HttpEntity(tax, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(uri, request, String.class);

        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusCodeValue());
    }

    @Test
    @Order(4)
    public void TestTaxGetSuccessfulData() throws URISyntaxException
    {
        URI uri = new URI(GetURL("tax", "1"));

        ResponseEntity<Tax> response = restTemplate.getForEntity(uri, Tax.class);

        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCodeValue());
        Assertions.assertEquals("Car", response.getBody().getType());
        Assertions.assertEquals(123.5, response.getBody().getPrice());
    }

    @Test
    @Order(5)
    public void TestCarPostSuccessfulHttpCode() throws URISyntaxException
    {
        URI uri = new URI(GetURL("car"));

        Car car = new Car();
        car.setRegplate("TestPlate");
        car.setModel("Ford");
        car.setMake("KA");

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Customer> request = new HttpEntity(car, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(uri, request, String.class);

        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusCodeValue());
    }

    @Test
    @Order(6)
    public void TestCarGetSuccessfulData() throws URISyntaxException
    {
        URI uri = new URI(GetURL("car", "1"));

        ResponseEntity<Car> response = restTemplate.getForEntity(uri, Car.class);

        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCodeValue());
        Assertions.assertEquals("TestPlate", response.getBody().getRegplate());
        Assertions.assertEquals("Ford", response.getBody().getModel());
        Assertions.assertEquals("KA", response.getBody().getMake());
    }

    @Test
    @Order(7)
    public void TestRegistrationPostSuccessfulHttpCode() throws URISyntaxException
    {
        URI uri = new URI(GetURL("registration"));

        Registration registration = new Registration();
        registration.setExpiry(LocalDate.parse("2022-05-20"));
        System.out.println(LocalDate.parse("2022-05-20"));

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Customer> request = new HttpEntity(registration, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(uri, request, String.class);

        Assert.assertEquals(HttpStatus.SC_CREATED, response.getStatusCodeValue());
    }

    @Test
    @Order(8)
    public void TestRegistrationGetSuccessfulData() throws URISyntaxException
    {
        URI uri = new URI(GetURL("registration", "1"));

        ResponseEntity<Registration> response = restTemplate.getForEntity(uri, Registration.class);

        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatusCodeValue());
        Assertions.assertEquals(LocalDate.parse("2022-05-20"), response.getBody().getExpiry());
        System.out.println(response.getBody().getExpiry());
    }
}

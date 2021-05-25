/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CarReq;
import io.swagger.client.model.CollectionModelCar;
import io.swagger.client.model.CollectionModelCustomer;
import io.swagger.client.model.CollectionModelRegistration;
import io.swagger.client.model.CollectionModelTax;
import io.swagger.client.model.CustomerReq;
import io.swagger.client.model.EntityModelCar;
import io.swagger.client.model.EntityModelCustomer;
import io.swagger.client.model.EntityModelRegistration;
import io.swagger.client.model.EntityModelTax;
import io.swagger.client.model.RegistrationReq;
import io.swagger.client.model.Tax;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressEntityApi
 */
@Ignore
public class AddressEntityApiTest {

    private final AddressEntityApi api = new AddressEntityApi();

    
    /**
     * deleteCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCarUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteCarUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * deleteCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteCustomerUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * deleteRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRegistrationUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteRegistrationUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * deleteTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaxUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteTaxUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * findAllCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllCarUsingGETTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        CollectionModelCar response = api.findAllCarUsingGET(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * findAllCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllCustomerUsingGETTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        CollectionModelCustomer response = api.findAllCustomerUsingGET(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * findAllRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllRegistrationUsingGETTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        CollectionModelRegistration response = api.findAllRegistrationUsingGET(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * findAllTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllTaxUsingGETTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        CollectionModelTax response = api.findAllTaxUsingGET(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * findByIdCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdCarUsingGETTest() throws ApiException {
        Integer id = null;
        EntityModelCar response = api.findByIdCarUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * findByIdCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdCustomerUsingGETTest() throws ApiException {
        Integer id = null;
        EntityModelCustomer response = api.findByIdCustomerUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * findByIdRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdRegistrationUsingGETTest() throws ApiException {
        Integer id = null;
        EntityModelRegistration response = api.findByIdRegistrationUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * findByIdTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findByIdTaxUsingGETTest() throws ApiException {
        Integer id = null;
        EntityModelTax response = api.findByIdTaxUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * saveCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCarUsingPATCHTest() throws ApiException {
        CarReq body = null;
        Integer id = null;
        EntityModelCar response = api.saveCarUsingPATCH(body, id);

        // TODO: test validations
    }
    
    /**
     * saveCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCarUsingPOSTTest() throws ApiException {
        CarReq body = null;
        EntityModelCar response = api.saveCarUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * saveCar
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCarUsingPUTTest() throws ApiException {
        CarReq body = null;
        Integer id = null;
        EntityModelCar response = api.saveCarUsingPUT(body, id);

        // TODO: test validations
    }
    
    /**
     * saveCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCustomerUsingPATCHTest() throws ApiException {
        CustomerReq body = null;
        Integer id = null;
        EntityModelCustomer response = api.saveCustomerUsingPATCH(body, id);

        // TODO: test validations
    }
    
    /**
     * saveCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCustomerUsingPOSTTest() throws ApiException {
        CustomerReq body = null;
        EntityModelCustomer response = api.saveCustomerUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * saveCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveCustomerUsingPUTTest() throws ApiException {
        CustomerReq body = null;
        Integer id = null;
        EntityModelCustomer response = api.saveCustomerUsingPUT(body, id);

        // TODO: test validations
    }
    
    /**
     * saveRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveRegistrationUsingPATCHTest() throws ApiException {
        RegistrationReq body = null;
        Integer id = null;
        EntityModelRegistration response = api.saveRegistrationUsingPATCH(body, id);

        // TODO: test validations
    }
    
    /**
     * saveRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveRegistrationUsingPOSTTest() throws ApiException {
        RegistrationReq body = null;
        EntityModelRegistration response = api.saveRegistrationUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * saveRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveRegistrationUsingPUTTest() throws ApiException {
        RegistrationReq body = null;
        Integer id = null;
        EntityModelRegistration response = api.saveRegistrationUsingPUT(body, id);

        // TODO: test validations
    }
    
    /**
     * saveTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveTaxUsingPATCHTest() throws ApiException {
        Tax body = null;
        Integer id = null;
        EntityModelTax response = api.saveTaxUsingPATCH(body, id);

        // TODO: test validations
    }
    
    /**
     * saveTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveTaxUsingPOSTTest() throws ApiException {
        Tax body = null;
        EntityModelTax response = api.saveTaxUsingPOST(body);

        // TODO: test validations
    }
    
    /**
     * saveTax
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveTaxUsingPUTTest() throws ApiException {
        Tax body = null;
        Integer id = null;
        EntityModelTax response = api.saveTaxUsingPUT(body, id);

        // TODO: test validations
    }
    
}
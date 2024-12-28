package com.rental.product.constant;

public class DefaultRolesPermission {

    private DefaultRolesPermission(){

    }

    public static final String MENU_DETAILS = "[{\"displayName\":\"Appointment\",\"icon\":\"dashboard\",\"route\":\"/rental/appointment\",\"defaultSelected\":true,\"sortOrder\":1},{\"displayName\":\"Product\",\"icon\":\"view_module\",\"route\":\"/rental/product\",\"sortOrder\":2},{\"displayName\":\"Customer\",\"icon\":\"person_pin\",\"route\":\"/rental/customer\",\"sortOrder\":4},{\"displayName\":\"Supplier\",\"icon\":\"person_pin\",\"route\":\"/rental/supplier\",\"sortOrder\":3},{\"displayName\":\"Order\",\"icon\":\"add_shopping_cart\",\"route\":\"/rental/order\",\"sortOrder\":5},{\"displayName\":\"User\",\"icon\":\"person_pin\",\"route\":\"/rental/user\",\"sortOrder\":7},{\"displayName\":\"Configuration\",\"icon\":\"settings_brightness\",\"route\":\"/rental/config\",\"sortOrder\":6}]";
    public static final String DEFAULT_ROLE_PERMISSION = "[{\"name\":\"ADMIN\",\"description\":\"Adminstraion of Rental Application\",\"permissions\":[{\"name\":\"USER\",\"permissionType\":\"CREATE\",\"description\":\"User Create\"},{\"name\":\"USER\",\"permissionType\":\"UPDATE\",\"description\":\"User Update\"},{\"name\":\"USER\",\"permissionType\":\"DELETE\",\"description\":\"User Delete\"},{\"name\":\"CONFIGURATION\",\"permissionType\":\"CREATE\",\"description\":\"Config Create\"},{\"name\":\"CONFIGURATION\",\"permissionType\":\"UPDATE\",\"description\":\"Config Update\"},{\"name\":\"CONFIGURATION\",\"permissionType\":\"DELETE\",\"description\":\"Config Delete\"}]},{\"name\":\"EMPLOYEE\",\"description\":\"Employee of Rental Application\",\"permissions\":[{\"name\":\"PRODUCT\",\"permissionType\":\"CREATE\",\"description\":\"Product Create\"},{\"name\":\"PRODUCT\",\"permissionType\":\"UPDATE\",\"description\":\"Product Update\"},{\"name\":\"PRODUCT\",\"permissionType\":\"DELETE\",\"description\":\"Product Delete\"},{\"name\":\"ORDER\",\"permissionType\":\"CREATE\",\"description\":\"Order Create\"},{\"name\":\"ORDER\",\"permissionType\":\"UPDATE\",\"description\":\"Order Update\"},{\"name\":\"ORDER\",\"permissionType\":\"DELETE\",\"description\":\"Order Delete\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"CREATE\",\"description\":\"Customer Create\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"UPDATE\",\"description\":\"Customer Update\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"DELETE\",\"description\":\"Customer Delete\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"CREATE\",\"description\":\"Supplier Create\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"UPDATE\",\"description\":\"Supplier Update\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"DELETE\",\"description\":\"Supplier Delete\"},{\"name\":\"DASHBOARD\",\"permissionType\":\"VIEW\",\"description\":\"Dashboard View\"}]},{\"name\":\"MANAGER\",\"description\":\"Manager of Rental Application\",\"permissions\":[{\"name\":\"PRODUCT\",\"permissionType\":\"CREATE\",\"description\":\"Product Create\"},{\"name\":\"PRODUCT\",\"permissionType\":\"UPDATE\",\"description\":\"Product Update\"},{\"name\":\"PRODUCT\",\"permissionType\":\"DELETE\",\"description\":\"Product Delete\"},{\"name\":\"ORDER\",\"permissionType\":\"VIEW\",\"description\":\"Order View\"},{\"name\":\"DASHBOARD\",\"permissionType\":\"VIEW\",\"description\":\"Dashboard View\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"CREATE\",\"description\":\"Customer Create\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"UPDATE\",\"description\":\"Customer Update\"},{\"name\":\"CUSTOMER\",\"permissionType\":\"DELETE\",\"description\":\"Customer Delete\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"CREATE\",\"description\":\"Supplier Create\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"UPDATE\",\"description\":\"Supplier Update\"},{\"name\":\"SUPPLIER\",\"permissionType\":\"DELETE\",\"description\":\"Supplier Delete\"}]},{\"name\":\"CASHIER\",\"description\":\"Cashier of Rental Application\",\"permissions\":[{\"name\":\"ORDER\",\"permissionType\":\"UPDATE\",\"description\":\"Order Update\"},{\"name\":\"Order\",\"permissionType\":\"DELETE\",\"description\":\"Order Delete\"},{\"name\":\"PAYMENT\",\"permissionType\":\"CREATE\",\"description\":\"Payment Create\"},{\"name\":\"PAYMENT\",\"permissionType\":\"UPDATE\",\"description\":\"Payment Update\"},{\"name\":\"INVOICE\",\"permissionType\":\"CREATE\",\"description\":\"Invoice Create\"}]}]";
}

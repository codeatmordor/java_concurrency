
// PACKAGE/IMPORTS --------------------------------------------------
package gk.code.java;

public class MyServiceTest {

    @Mock
    private CustomerDao daoMock;

    @InjectMocks
    private CustomerService serv;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMock(this);

    }

@Test
public void testAddCustomer_returnsNewCustomer(){
when(daoMock.save(any(Customer.class))).thenReturn(new Customer());
Customer c = new Customer();
assertThat(service.addCustomer(c), is(notNullValue()))));
}

}
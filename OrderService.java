package orderapp.Online_Food_Order_Application.service;


import orderapp.Online_Food_Order_Application.dto.BillResponse;
import orderapp.Online_Food_Order_Application.dto.OrderRequest;
import orderapp.Online_Food_Order_Application.dto.PaymentDto;
import orderapp.Online_Food_Order_Application.entity.Order;
import orderapp.Online_Food_Order_Application.entity.OrderStatus;


public interface OrderService {

	BillResponse generateBill(OrderRequest orderRequest);
	
	String payAndPlaceOrder(PaymentDto payment);
	
	void deleteOrder(Integer id);
	
	Order getOrder(Integer id);
	
	Order updateStatusByAdmin(OrderStatus status, Integer id);
	
	String cancelOrder(Integer id);
	
}

package paymentapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paymentapp.persistence.dao.PayeeDAO;
import paymentapp.persistence.dao.PayerCardDAO;
import paymentapp.persistence.dao.PaymentDAO;
import paymentapp.persistence.dto.Payee;
import paymentapp.persistence.dto.PayerCard;
import paymentapp.persistence.dto.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PayeeDAO payeeDAO;
	
	@Autowired
	private PayerCardDAO payerCardDAO;
	
	@Autowired
	private PaymentDAO paymentDAO;
	
	@Override
	@Transactional
	public Integer submitPayment(Payee payee, PayerCard payer) {
		
		//todo: check if the payee already exist
		payeeDAO.addPayee(payee);
		//todo:check if the payer already exist
		payerCardDAO.addCard(payer);
		Payment payment = new Payment(payee,payer);
		paymentDAO.addPayment(payment);
		return payment.getId();
	}

	@Override
	public boolean getPaymentStatusUsingPaymentId(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}

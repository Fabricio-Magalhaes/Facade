package facade;

/**
 *
 * @author Usuario
 */
public class ReservasViagem {
    protected ReservaAviao _reservaAviao;
    protected ReservaCarro _reservaCarro;
    protected ReservaHotel _reservaHotel;
    protected Pagamentos _pagamentos;
    
    public void ReservaProdutos(){
        _reservaAviao = new ReservaAviao();
        _reservaAviao.compania();
        
        _reservaCarro = new ReservaCarro();
        _reservaCarro.reservaCarro();
        
        _reservaHotel = new ReservaHotel();
        _reservaHotel.reservaHotel();
        
        _pagamentos = new Pagamentos();
        _pagamentos.pagamento();
    }
    
}

package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer numQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer numQuarto, Date checkIn, Date checkOut) {
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizacaoDatas(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto " +
            numQuarto +
            ", check-in: " +
            sdf.format(checkIn) +
            ", check-out: " +
            sdf.format(checkOut) +
            ", " + duracao() +
            " noites";
    }

    

}

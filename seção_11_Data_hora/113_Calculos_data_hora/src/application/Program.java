package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		LocalDate d04 = LocalDate.parse("2023-02-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-07T01:30:26");
		Instant d06 = Instant.parse("2023-02-07T01:30:26Z");
		
		// subtraindo e somando 7 dias a essas datas das instancias LocalDate
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		// subtraindo e somando 7 dias a essas datas das instancias LocalDateTime
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		// instant não tem o método de dias meses e anos, então utiliza o minus
		// de primeiro argumento é quantos dias meses sera subtraido e no segundo
		// argumento é passado se é dia mes ou ano, o mesmos e aplica para o plus.
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		// atTime() converte objetos LocalDate para LocalDateTime contendo horas
		// segundos e minutos o mesmo se aplica para o D04 que é um instancia LocalDate
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		// atStartOfDay() vai converter o pastWeekLocalDate para LocalDateTime a meia noite
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T2 dias = " + t3.toDays());
	}

}

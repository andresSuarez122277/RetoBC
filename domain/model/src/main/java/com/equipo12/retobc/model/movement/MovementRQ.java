package com.equipo12.retobc.model.movement;

import com.equipo12.retobc.model.balance.AccountRQ;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class MovementRQ {

	private PaginationRQ pagination;
	private AccountRQ account;
	private TransactionRQ transaction;
	private OfficeRQ office;
	
}

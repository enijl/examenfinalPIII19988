package com.beesion.ms.sudoku;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/sudoku")
public class SudokuResource {

    @Inject
    SudokuValidator validator;

    @POST
    public Response validate(SudokuRequest request) {
        boolean result = validator.isValidSudoku(request.board);
        return Response.ok(result).build();
    }
}

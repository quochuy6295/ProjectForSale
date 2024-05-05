package projectmicroservice.projectforsale.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projectmicroservice.projectforsale.dto.ContentDto;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.service.SupportService;

import java.util.List;

@RestController
@RequestMapping(value = "/notice/v1/boards/landing")
public class SupportController {

    @Autowired
    private SupportService supportService;
    // 1 api lnb
    @GetMapping(value = "/lnb")
    public ResponseEntity<List<LnbResponseDto>> getLnb(@PathParam("lang") String lang, @PathParam("scope") String scope,
                                                      @PathParam("state") String state, @PathParam("type") String type) {
        List<LnbResponseDto> response = supportService.getLnb(lang, scope, state, type);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // 1 api detail
    @GetMapping(value = "/detail")
    public ResponseEntity<DetailResponseDto> getDetail(@PathParam("lang") String lang, @PathParam("scope") String scope,
                                                       @PathParam("state") String state, @PathParam("type") String type,
                                                       @PathParam("offset") Integer offset, @PathParam("limit") Integer limit) {
        DetailResponseDto response = supportService.getDetail(lang, scope, state, type, offset, limit);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}



package com.example.hot;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.hot.api.DemoController;
import com.example.hot.entity.User;
import com.example.hot.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * user controller test - use mockito.
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(value = DemoController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserMapper userMapper;

    /**
     * test find all user.
     *
     * @throws Exception exception
     */
    @Test
    @DisplayName("Test selectList()")
    public void list() throws Exception {
        Mockito.when(userMapper.selectList(null)).thenReturn(
                Collections.singletonList(new User(1L, "pdai.tech", 14, "1221111")));

        mockMvc.perform(MockMvcRequestBuilders.get("/mp")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        verify(userMapper, times(1)).selectList(null);
    }
}

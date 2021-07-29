package com.bearxsh.nettylearn.test;

import lombok.Data;

/**
 * @author bearx
 */
@Data
public class TransferMsg {
    private Integer length;
    private byte[] msg;
}

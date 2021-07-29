package com.bearxsh.nettylearn.test;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author bearx
 */
public class TransferMsgEncoder extends MessageToByteEncoder<TransferMsg> {
    @Override
    protected void encode(ChannelHandlerContext ctx, TransferMsg msg, ByteBuf out) throws Exception {
        out.writeInt(msg.getLength());
        out.writeBytes(msg.getMsg());
    }
}

package com.bearxsh.nettylearn.test;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/**
 * @author bearx
 */
public class TransferMsgDecoder extends ReplayingDecoder<Void> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        int count = in.readInt();
        byte[] bytes = new byte[count];
        in.readBytes(bytes);

    }
}

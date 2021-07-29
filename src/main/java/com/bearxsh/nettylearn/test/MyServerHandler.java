package com.bearxsh.nettylearn.test;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * @author bearx
 */
public class MyServerHandler extends SimpleChannelInboundHandler<ByteBuf> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        int i = msg.readableBytes();
        System.out.println("读取到的字节数 " + i);
        // 回显
        String s = msg.toString(CharsetUtil.UTF_8);
        System.out.println("收到：" + s);
        ctx.channel().writeAndFlush(Unpooled.copiedBuffer("hello " + s, CharsetUtil.UTF_8));
    }
}

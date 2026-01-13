package com.jad.rotatingbuffer;

class RotatingBufferWriter<E> extends RotatingBufferActor<E> {

    RotatingBufferWriter(final RotatingBuffer<E> buffer) {
        super(buffer);
    }

    public boolean write(final E data) {
        if (this.buffer.isFull()) {
            return false;
        }
        this.buffer.getData()[this.index] = data;
        this.incrementIndex();
        this.buffer.incrementCount();
        return true;
    }
}
package com.jad.rotatingbuffer;

abstract class RotatingBufferActor<E> {

    protected final RotatingBuffer<E> buffer;
    protected int index;

    protected RotatingBufferActor(final RotatingBuffer<E> buffer) {
        this.buffer = buffer;
        this.index = 0;
    }

    int getIndex() {
        return this.index;
    }

    void reset() {
        this.index = 0;
    }

    protected void incrementIndex() {
        this.index = (this.index + 1) % this.buffer.getSize();
    }
}
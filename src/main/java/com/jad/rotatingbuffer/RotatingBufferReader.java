package com.jad.rotatingbuffer;

class RotatingBufferReader<E> extends RotatingBufferActor<E> {

    RotatingBufferReader(final RotatingBuffer<E> buffer) {
        super(buffer);
    }

    public E read() {
        if (this.buffer.isEmpty()) {
            return null;
        }
        final E value = this.buffer.getData()[this.index];
        this.incrementIndex();
        this.buffer.decrementCount();
        return value;
    }
}